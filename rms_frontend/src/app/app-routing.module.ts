import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { SingupComponent } from './pages/singup/singup.component';
import { LoginComponent } from './pages/login/login.component';
import { DashboardComponent } from './pages/admin/dashboard/dashboard.component';
import { UserDashboardComponent } from './pages/user/user-dashboard/user-dashboard.component';
import { clienteGuard } from './services/cliente/cliente.guard';
import { AdminGuard } from './services/admin/admin.guard';
import { ProfileComponent } from './pages/profile/profile.component';
import { WelcomeComponent } from './pages/admin/welcome/welcome.component';
import { ViewCategoriasComponent } from './pages/admin/view-categorias/view-categorias.component';
import { AddCategoriasComponent } from './pages/admin/add-categorias/add-categorias.component';
import { ViewProductosComponent } from './pages/admin/view-productos/view-productos.component';
import { AddProductoComponent } from './pages/admin/add-producto/add-producto.component';

//CONFIG DE RUTAS
const routes: Routes = [
  {
    path:'',
    component:HomeComponent,
    pathMatch:'full'
  },
  {
    path:'singup',
    component:SingupComponent,
    pathMatch:'full'
  },
  {
    path:'login',
    component:LoginComponent,
    pathMatch:'full'
  }
  ,
  {
    path:'admin',
    component:DashboardComponent,
    canActivate:[AdminGuard],
    children:[
      {
        path:'profile',
        component: ProfileComponent 
      },
      {
        path:'',
        component: WelcomeComponent
      },
      {
        path:'categorias',
        component: ViewCategoriasComponent
      },
      {
        path:'add-categoria',
        component: AddCategoriasComponent
      },
      {
        path:'productos',
        component: ViewProductosComponent
      },
      {
        path:'add-productos',
        component: AddProductoComponent
      }
    ]
  },
  {
    path:'user-dashboard',
    component:UserDashboardComponent,
    pathMatch:'full',
    canActivate:[clienteGuard]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
