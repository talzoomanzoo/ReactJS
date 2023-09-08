import React, {Component} from 'react';
import "./StatusBar.css";
import { Avatar } from '@material-ui/core';
import statusimg from '../../images/statusadd.png'
class StatusBar extends Component {
    constructor(props) {
        super(props)
        this.state={ }
    }
    render() {
        return (
            <div className='statusbar__container'>
                <div className='status'>
                    <Avatar className='statusbar__status' src={statusimg}/>
                    <div className='statusbar__text'>Anubhav</div>
                </div>
                <div className='status'>
                    <Avatar className='statusbar__status' src={statusimg}/>
                    <div className='statusbar__text'>Anubhav</div>
                </div>
                <div className='status'>
                    <Avatar className='statusbar__status' src={statusimg}/>
                    <div className='statusbar__text'>Anubhav</div>
                </div>
                <div className='status'>
                    <Avatar className='statusbar__status' src={statusimg}/>
                    <div className='statusbar__text'>Anubhav</div>
                </div>
            </div>
        );
    }
}

export default StatusBar;