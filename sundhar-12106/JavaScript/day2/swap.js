// document.writeln("a = 5, b=10<br\>")
        //! using temp variable
        var a = 5, b=10;
        var c;
        c = a;
        a = b;
        b = c;
        // document.writeln(`the value of a is : ${a} and b is : ${b}`)
        console.log(`the value of a is : ${a} and b is : ${b}`);

        //! without using temp varible

        a = a + b;
        b = a - b; //
        a = a - b;

        // console.log(`a${a} : b${b}`);
        document.writeln(`the value of a is : ${a} and b is : ${b} again swapped without temp variable`)