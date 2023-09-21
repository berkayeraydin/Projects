import { Pipe, PipeTransform } from '@angular/core';
import { PostForListingModel } from '../models/postForListingModel';

@Pipe({
  name: 'searchPost',
})
export class SearchPostPipe implements PipeTransform {
  transform(
    value: PostForListingModel[],
    searchKey: string
  ): PostForListingModel[] {
    if (!searchKey || searchKey.length < 3) return value;

    return value.filter((post) => post.title.includes(searchKey));
  }
}
