import React from 'react';
import '../../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import PropTypes from 'prop-types';
import {NavLink} from 'react-router-dom';

export var BazinisSablonas =(props)=>{

    return(
        <form >
            <div>
                <p>Gamintojas Vagono</p>
                <div>
                <input type="text" className="form-control" id="gamintojas" placeholder="Gamintojas" value={props.gamintojas}
                           onChange={props.onChange}/>
                </div>
            </div>
            

            <div>
                <p>Kiekis</p>
                <div>
                <input type="text" className="form-control" id="kiekis" placeholder="Kiekis" value={props.kiekis}
                           onChange={props.onChange}/>
                </div>
            </div>

            <div>
                <p>Kaina</p>
                <div>
                <input type="text" className="form-control" id="kaina" placeholder="Kaina" value={props.kaina}
                      onChange={props.onChange}      />
                </div>
            </div>
            <div>
                <p>Turis</p>
                <div>
                <input type="text" className="form-control" id="turis" placeholder="Turis" value={props.turis}
                      onChange={props.onChange}      />
                </div>
            </div>



           

            <div >
                <div >
                  
                    <button type="submit"  onClick={props.onClick}>Save</button>
                    <button type="submit"  onClick={props.history.goBack}>Cancel</button>
                </div>
            </div>
</form>





    )
}