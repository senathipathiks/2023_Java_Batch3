    var min=10;
    var t=min * 60;


      var time=document.getElementById('timer');
      setInterval(check,1000);

        function check() {
             var minutes= Math.floor(t / 60);
             var seconds= t % 60;
            time.innerHTML = `${minutes}: ${seconds}`;
             t--;
        
        }