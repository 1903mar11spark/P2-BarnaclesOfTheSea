import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


import { CreateUserComponent } from './components/create-user/create-user.component';
import { LoginComponent } from './components/login/login.component';




const routes: Routes = [

  
  { path: 'login', component: LoginComponent},
  { path: 'signUp', component: CreateUserComponent},

  // sneeky trick to redirect them back
  // { path: '**', redirectTo: 'login' }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
