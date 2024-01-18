import { component } from "./component";
import{connect} from "react-redux"

const mapStateToProps =state =>{
    return{
        count:state
    };
};

const mapDispatchToProps = dispatch =>{
    return{
        handleIncrementClick: ()=>dispatch({type :"INCREMENT"}),
        handleDecrementClick:()=>dispatch({type:"DECREMENT"})   
}};
export default connect(mapStateToProps,mapDispatchToProps)(component);  //connects