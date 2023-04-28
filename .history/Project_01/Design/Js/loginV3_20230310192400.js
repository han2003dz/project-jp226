// các xử lý kịch bản cho loginV3
function checkValidLogin() {
    let Pass = document.getElementById('inputPass').value;
    let pass = document.getElementById('inputPass').value;
    // tham chiếu vị tri báo lỗi
    let viewErrPass = document.getElementById('errPass');
    let viewErrPass = document.getElementById('errPass');
    // biến xác nhận sử hợp lệ
    var validPass = true;
    var validPass = true;
    // Biến ghi nhận thông báo
    var message = '';
    // check
    Pass = Pass.trim();
    if(Pass == '') {
        validPass = false;
        message = 'Please input userPass for login!';
    }else{
        if((Pass.length < 5) || (Pass.length > 50)){
            validPass = false;
            message = 'UserPass length have from 5 to 50 characters';
        }else{
            if(Pass.indexOf(' ') != -1) {
                validPass = false;
                message = 'UserPass should not contain space character';
            }else{
                if(Pass.indexOf('@') != -1) {
                    var parttern = /\w+@\w+[.]\w/;
                    if(!Pass.match(parttern)){
                        validPass = false;
                        message = 'UserPass is incorrect email structure';
                    }
                }
            }
        }
    }

    // xuất thông báo của userPass
    viewErrPass.style.paddingTop = '5px';
    viewErrPass.style.paddingBottom = '5px';
    viewErrPass.style.marginTop = '5px';
    viewErrPass.style.fontSize = '12px';
    if(validPass) {
        viewErrPass.innerHTML = '<i class="fa-solid fa-circle-check"></i>';
        viewErrPass.style.backgroundColor = 'transparent';
        viewErrPass.style.color = 'blue';
    }else{
        viewErrPass.innerHTML = message;
        viewErrPass.style.backgroundColor = 'red';
        viewErrPass.style.color = 'yellow';
    }

    // kiểm tra pass
    pass = pass.trim();
    if(pass == ''){
        validPass = false;
        message = 'please input password for login';
    }else{
        if((pass.length < 6)) {
            validPass = false;
            message = 'length of pass is greater than or equal to 6 character';
        }
    }
    // xuất thông báo cho pass
    viewErrPass.style.paddingTop = '5px';
    viewErrPass.style.paddingBottom = '5px';
    viewErrPass.style.marginTop = '5px';
    viewErrPass.style.fontSize = '12px';
    if(validPass) {
        viewErrPass.innerHTML = '<i class="fa-solid fa-circle-check"></i>';
        viewErrPass.style.backgroundColor = 'transparent';
        viewErrPass.style.color = 'blue';
    }else{
        viewErrPass.innerHTML = message;
        viewErrPass.style.backgroundColor = 'red';
        viewErrPass.style.color = 'yellow';
    }
    return validName && validPass;
}