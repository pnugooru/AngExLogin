import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home';
import { AuthGuard } from './_helpers';
import { SetUpMFAComponent } from './set-up-mfa';
import { MFATokenComponent } from './mfa-token';
import { ViewCaseDocumentComponent } from './view-case-document';
import { SetUpComponent } from './set-up';
import { RefreshMfaComponent } from './refresh-mfa';
import { LoginComponent } from './account/login.component'

const accountModule = () => import('./account/account.module').then(x => x.AccountModule);
const usersModule = () => import('./users/users.module').then(x => x.UsersModule);

const routes: Routes = [
  { path: '', component: SetUpComponent, canActivate: [AuthGuard] },
    { path: 'users', loadChildren: usersModule, canActivate: [AuthGuard] },
  { path: 'account', loadChildren: accountModule },
  { path: 'set-up-mfa', component: SetUpMFAComponent, canActivate: [AuthGuard]},
  { path: 'set-up', component: SetUpComponent, canActivate: [AuthGuard]},
  { path: 'refresh-mfa', component: RefreshMfaComponent, canActivate: [AuthGuard]},
  { path: 'mfa-token', component: MFATokenComponent, canActivate: [AuthGuard]},
  { path: 'view-case-document', component: ViewCaseDocumentComponent, canActivate: [AuthGuard]},
  { path: 'login', component: LoginComponent },
  // otherwise redirect to home
  { path: '**', component: SetUpComponent }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
