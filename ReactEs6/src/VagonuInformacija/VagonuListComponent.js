import React from 'react';
import {VagonuSingleComponent} from './VagonuSingleComponent'


export var VagonuListComponent = (props) => {
    const trains = props.trains.map((train,index) => {
        
         var trainComponent=   <VagonuSingleComponent  
                id={train.id}   
                key={index}   
                tipas={train.tipas}  
                gamintojas={train.gamintojas}   
                kiekis={train.kiekis}         
                kaina={train.kaina}  
                 turis={train.turis}   
                 klase={train.klase}   
                  lokomotyvas={train.lokomotyvas}                  
                  galia={train.galia} 
                
                history={props.history}

            />;
            return (trainComponent
            );
            
        
    });
    return (
        <div>
            {trains}
        </div>
    );
};