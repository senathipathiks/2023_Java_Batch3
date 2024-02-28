const obj ={
    name:"prem", degree:"EEE"

}
console.log(obj.name);

// obj={name:"ashok",degree:"EEE"}
// console.log(obj.name);

const arr=[10,20,30]
X=arr[0]
Y=arr[1]

const[first,second,third]=arr;
console.log(`${first}, ${second}, ${third}`);

const obj1={firstname:"Prem",lastname:"M"}
console.log(obj1)

const { firstname:fname,lastname:lname}=obj1
console.log(fname)
console.log(lname)

const arr1=[12,33,45];
const arr2=arr1.map(function(element){
    return element*3;
});
console.log(arr2);