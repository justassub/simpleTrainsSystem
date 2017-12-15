import React from 'react';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import PropTypes from 'prop-types';
import {NavLink} from 'react-router-dom';

export var TrainAddComponent =(props)=>{

    return(
        <form >
            <div>
                <p>Train was made in what years?</p>
                <div>
                <input type="text" className="form-control" id="years" placeholder="Years" value={props.years}
                           onChange={props.onChange}/>
                </div>
            </div>
            

            <div>
                <p>Enterprise of train</p>
                <div>
                <input type="text" className="form-control" id="enterprise" placeholder="Enterprise" value={props.enterprise}
                           onChange={props.onChange}/>
                </div>
            </div>

            <div>
                <p>City</p>
                <div>
                <input type="text" className="form-control" id="city" placeholder="City" value={props.city}
                         onChange={props.onChange}   />
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
