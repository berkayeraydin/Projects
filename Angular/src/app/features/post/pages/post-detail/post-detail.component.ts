import { Component, OnInit } from '@angular/core';
import { PostService } from '../../services/post.service';
import { ActivatedRoute } from '@angular/router';
import { PostForListingModel } from '../../models/postForListingModel';

@Component({
  templateUrl: './post-detail.component.html',
  styleUrls: ['./post-detail.component.css'],
})
export class PostDetailComponent implements OnInit {
  postId!: number;
  post!: PostForListingModel;

  constructor(
    private postService: PostService,
    private activatedRoute: ActivatedRoute
  ) {}
  ngOnInit(): void {
    this.readIdFromQuery();
  }
  // Eğer async işlemler birbirine bağlı ise, bağlılık durumu subscribeların içerisinde çözümlenmeli.
  readIdFromQuery() {
    this.activatedRoute.queryParams.subscribe((params) => {
      this.postId = params['id'];
      this.fetchDetails();
    });
  }
  fetchDetails() {
    this.postService.getById(this.postId).subscribe((response) => {
      this.post = response;
    });
  }
}
