function cardnumber(inputtxt)
{
  var cardno = /^(?:6[47][0-9]{13})$/;
  if(inputtxt.value.match(cardno))
        {
      return true;
        }
      else
        {
        alert("Not a valid Rupay credit card number! Enter a valid card number");
        return false;
        }
}