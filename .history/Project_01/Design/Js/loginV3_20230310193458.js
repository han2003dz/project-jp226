// các xử lý kịch bản cho loginV3
function checkValidLogin() {
    let name = document.getElementById('inputName').value;
    let pass = document.getElementById('inputPass').value;
    // tham chiếu vị tri báo lỗi
    let viewErrName = document.getElementById('errName');
    let viewErrPass = document.getElementById('errPass');
    // biến xác nhận sử hợp lệ
    var validName = true;
    var validName = true;
    // Biến ghi nhận thông báo
    var message = '';
    // check
    name = name.trim();
    if(name == '') {
        validName = false;
        message = 'Please input userName for login!';
    }else{
        if((name.length < 5) || (name.length > 50)){
            validName = false;
            message = 'UserName length have from 5 to 50 characters';
        }else{
            if(name.indexOf(' ') != -1) {
                validName = false;
                message = 'UserName should not contain space character';
            }else{
                if(Name.indexOf('@') != -1) {
                    var parttern = /\w+@\w+[.]\w/;
                    if(!Name.match(parttern)){
                        validName = false;
                        message = 'UserName is incorrect email structure';
                    }
                }
            }
        }
    }

    // xuất thông báo của userName
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