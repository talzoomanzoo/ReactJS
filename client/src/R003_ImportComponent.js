import React, {Component} from 'react';

class R003_ImportComponent extends Component {
    static getDerivedStateFromProps(props, state) {
        console.log('2.getDerivedStateFromProps Call:'+props.prop_value);
        return {};
    }
    constructor(props) { // 최초 실행
        super(props);
        this.state={};
        console.log('1. constructor Call');
    }
    render () { // html 
        console.log('3. render Call')
        return (
            <h2>[THIS IS IMPORTED COMPONENT]</h2>
        )
    }
}

export default R003_ImportComponent;