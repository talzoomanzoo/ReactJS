import React, {Component} from "react";
import "./NavBar.css";
import Grid from "@material-ui/core/Grid";
import inst_logo from '../../images/logoinsta.png';
import home from '../../images/home.svg';
import message from '../../images/message.svg';
import find from '../../images/find.svg';
import react from '../../images/love.svg';
import { Avatar } from "@material-ui/core";
import dp from '../../images/dp6.png';
class NavBar extends Component {
    constructor(props) {
        super(props)
        this.state={ }
    }
    render() {
        return (
            <div>
                <div className="navbar__barcontent">
                    <Grid container>
                        <Grid item xs={2}>

                        </Grid>
                        <Grid item xs={3}>
                            <img className="navbar__logo" src={inst_logo} width="105px"/>
                        </Grid>
                        <Grid item xs={3}>
                            <img text="text" className="navbar__searchbar" placeholder="Search"/>
                        </Grid>
                        <Grid item xs={3} style={{"display":"flex"}}>
                            <img className="navbar__img" src={home} width="25px"/>
                            <img className="navbar__img" src={message} width="25px"/>
                            <img className="navbar__img" src={find} width="25px"/>
                            <img className="navbar__img" src={react} width="25px"/>
                            <Avatar src={dp} className="navbar__img" style={{"maxHeight":"25px", "maxWidth":"25px"}}/>
                        </Grid>
                        <Grid item xs={1}></Grid>
                    </Grid>
            </div>
        </div>
        );
    }
}
export default NavBar;