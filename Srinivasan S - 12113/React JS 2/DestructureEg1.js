const arr=[10,20,30];
// arr[0]
// arr[1]

const [first,second,third,fourth]=arr
console.log(arr);
console.log(fourth);

let obj={
    firstname:"Srini",
    midname:"Vasan",
    lastname:"S",

}
const {firstname:fname,midname:mname,lastname:lname}=obj
console.log(obj);
console.log(fname,mname,lname);