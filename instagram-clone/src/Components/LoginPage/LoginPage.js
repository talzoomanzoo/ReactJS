import React, {Component} from "react";
import Grid from '@material-ui/core/Grid';
import './LoginPage.css';
import inst_image from 'D:/reactJS/instagram-clone/src/images/9364675fb26a.svg';
import inst_logo from '../../images/logoinsta.png'
import fb from '../../images/fb.png'

class LoginPage extends Component {
    constructor(props) {
        super(props);
        this.state = {}
    }
    render() {
        return(
            <div>
                <Grid container>
                    <Grid item xs={3}>
                    </Grid>
                    <Grid item xs={6}>
                        <div className="loginpage__main">
                            <div>
                                <img src={inst_image} width="450"/>
                            </div>
                        <div>
                        <div className="loginpage__rightcomponent">
                            <img className="loginpage__logo" src={inst_logo}/>
                            <div className="loginPage__signin">
                                <input className="loginpage__text" type="text" placeholder="Phone number, username or email"/>
                                <input className="loginpage__text" type="password" placeholder="Password"/>
                                <button className="loginpage__button">Sign In</button>
                            </div>
                            <div className="login__ordiv">
                                <div className="loginpage__dividor"></div>
                                <div className="loginpage__or">OR</div>
                                <div className="loginpage__dividor"></div>
                            </div>
                            <div className="loginpage__fb">
                                <img src={fb} width="15px"/>Log in with Facebook</div>
                            <div className="loginpage__forgot">Forgot Password?</div>
                        </div>
                        </div>
                        </div>
                    </Grid>

                    <Grid item xs={3}></Grid>
                </Grid>
            </div>
        )
    }
}
export default LoginPage;