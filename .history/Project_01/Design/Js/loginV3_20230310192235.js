// các xử lý kịch bản cho loginV3
function checkValidLogin() {
    let name = document.getElementById('inputName').value;
    let pass = document.getElementById('inputName').value;
    // tham chiếu vị tri báo lỗi
    let viewErrName = document.getElementById('errName');
    let viewErrPass = document.getElementById('errPass');
    // biến xác nhận sử hợp lệ
    var validName = true;
    var validPass = true;
    // Biến ghi nhận thông báo
    var message = '';
    // check
    name = name.trim();
    if(name == '') {
        validName = false;
        message = 'Please input username for login!';
    }else{
        if((name.length < 5) || (name.length > 50)){
            validName = false;
            message = 'Username length have from 5 to 50 characters';
        }else{
            if(name.indexOf(' ') != -1) {
                validName = false;
                message = 'Username should not contain space character';
            }else{
                if(name.indexOf('@') != -1) {
                    var parttern = /\w+@\w+[.]\w/;
                    if(!name.match(parttern)){
                        validName = false;
                        message = 'Username is incorrect email structure';
                    }
                }
            }
        }
    }

    // xuất thông báo của username
    viewErrName.style.paddingTop = '5px';
    viewErrName.style.paddingBottom = '5px';
    viewErrName.style.marginTop = '5px';
    viewErrName.style.fontSize = '12px';
    if(validName) {
        viewErrName.innerHTML = '<i class="fa-solid fa-circle-check"></i>';
        viewErrName.style.backgroundColor = 'transparent';
        viewErrName.style.color = 'blue';
    }else{
        viewErrName.innerHTML = message;
        viewErrName.style.backgroundColor = 'red';
        viewErrName.style.color = 'yellow';
    }

    // kiểm tra pass
    pass = pass.trim();
    if(pass == ''){
        validPass = false;
        message = 'please input password for login';
    }else{
        if((pass.length < 6)) {
            validPass = false;
            message = 'length of pass is greater '
        }
    }
}