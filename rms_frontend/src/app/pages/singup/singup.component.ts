import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user/user.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-singup',
  templateUrl: './singup.component.html',
  styleUrls: ['./singup.component.css']
  
})
export class SingupComponent implements OnInit{
  public user={
    username:'',
    password: '',
    nombres : '',
    apellidos : '',
    fecha_nac : '',
    cedula : '',
    telefono : '',
    email : ''
  }

  constructor( private userService:UserService,private snack:MatSnackBar){ }

  ngOnInit(): void {
  }
  formSubmit(){
    console.log(this.user);
    if(this.user.username == '' || this.user.username == null){
      this.snack.open('El nombre de usuario es requerido !!','Aceptar',{
        duration : 3000,
        verticalPosition : 'top',
        horizontalPosition : 'right'
      });
      return;
    }

    this.userService.añadirUsuario(this.user).subscribe(
      (data) => {
        console.log(data);
        Swal.fire('Usuario Guardado','Registro Exititoso','success')
      },(error)=>{
        console.log(error);
        this.snack.open('A Ocurrido un error !!','Aceptar',{
          duration : 3000,
        });
      }
    )
  }
}
