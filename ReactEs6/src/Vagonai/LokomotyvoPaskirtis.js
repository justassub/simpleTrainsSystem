import React from 'react';
import {NavLink} from 'react-router-dom';
export class LokomotyvoPaskirtis extends React.Component  {    
    render(){
       
        return(
            <div>
            <h3>kokia Lokomotyvo Paskirtis?  </h3>
            <NavLink to={"/"+this.props.match.params.id+ "/vagonai/add/lokomotyvas/traukiantis"}>
            <button onClick={this.tipas1}>traukiantis</button></NavLink>
            <NavLink to={"/"+this.props.match.params.id+ "/vagonai/add/lokomotyvas/stumiantis"}>
            <button>stumiantis</button></NavLink>          
            <NavLink to={"/"+this.props.match.params.id+"/vagonai/add"}>
            <button>Nezinau pats ko noriu ,bet nenoriu lokomotyvo vagono</button></NavLink>
            </div>
        );
    }



}