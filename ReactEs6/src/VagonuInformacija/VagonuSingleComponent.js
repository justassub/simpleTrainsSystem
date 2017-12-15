import React from 'react';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import {NavLink} from 'react-router-dom';
import axios from 'axios';




export class VagonuSingleComponent extends React.Component  {    
    trinti=()=> {
        axios.delete('http://localhost:8081/train-app/vagonai/delete/'+this.props.id)                
    }
   
render(){    
    return (   
       <div className="col-xs-12 col-sm-4 text-center">  
         
        
                    <div className="thumbnail">  
                                  
                    <h2>{this.props.id}vagono id</h2>
                    <h3>{this.props.tipas}VAGONO TIPAS</h3>  
                    <h2>{this.props.kiekis} VAGONU KIEKIS</h2>                                       
                    <p>{this.props.kaina} 
                    VAGONO KAINA </p>  
                    <p>{this.props.turis}  TURIS </p>  
                    <p>{this.props.klase}  KLASE  </p>  
                    <p>{this.props.lokomotyvas} LOKOMOTYVO PASKIRTIS </p>  
                    <p>{this.props.galia} VAGONO GALIA </p>  
                    <p>{this.props.kiekis*this.props.kaina}VISA KAINA</p>
                    <button onClick={this.trinti}> Trinti vagona</button>
                    

                   
                 
                
                
            </div>
            </div>
           
           
            
        );
    }

};