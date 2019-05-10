import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


import { CreateUserComponent } from './components/landings/create-user/create-user.component';
import { LoginComponent } from './components/landings/login/login.component';
import { AdminHomeComponent } from './components/landings/admin-home/admin-home.component';
import { UserHomeComponent } from './components/landings/user-home/user-home.component';
import { FlipCardComponent } from './components/features/flip-card/flip-card.component';



const routes: Routes = [

  
  { path: 'login', component: LoginComponent},
  { path: 'signUp', component: CreateUserComponent},
  { path: 'adminHome', component: AdminHomeComponent},
  { path: 'flip', component: FlipCardComponent}
  // sneeky trick to redirect them back
  // { path: '**', redirectTo: 'login' }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
