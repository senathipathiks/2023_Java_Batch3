
        const obj={         //we can't reassign the  content of const completely ,,, but we can change the specfic value
            name:"kavi",
            degree:"ph.d"
        }
        console.log(obj.name)

        obj.name="kp"
        obj.degree="bca"
        console.log(obj.name) // change that existing content to new one
        console.log(obj.degree)
   