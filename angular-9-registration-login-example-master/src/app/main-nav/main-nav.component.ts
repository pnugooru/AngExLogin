import { Component } from '@angular/core';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { Observable } from 'rxjs';
import { map, shareReplay } from 'rxjs/operators'
import { AccountService } from '../_services';
import { User } from '../_models';

@Component({
  selector: 'app-main-nav',
  templateUrl: './main-nav.component.html',
  styleUrls: ['./main-nav.component.less']
})
export class MainNavComponent {
  user: User;

  constructor(private accountService: AccountService) {
    this.accountService.user.subscribe(x => this.user = x);
  }

  logout() {
    this.accountService.logout();

    //isHandset$: Observable<boolean> = this.breakpointObserver.observe(Breakpoints.Handset)
    //  .pipe(
    //    map(result => result.matches),
    //    shareReplay()
    //  );

    //constructor(private breakpointObserver: BreakpointObserver) { }

  }
}
