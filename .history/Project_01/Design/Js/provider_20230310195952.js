function checkValidProvider() {
    let name = document.getElementById('inputName').value;
    let check = document.getElementById('chkSave').checked;
    // tham chiếu vị tri báo lỗi
    // let viewErrName = document.getElementById('errName');
    let btnRegister = document.getElementById('btn-Register');
    // biến xác nhận sử hợp lệ
    var validName = true;
    // Biến ghi nhận thông báo
    var message = '';
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
                if(name.indexOf('@') != -1) {
                    var parttern = /\w+@\w+[.]\w/;
                    if(!name.match(parttern)){
                        validName = false;
                        message = 'UserName is incorrect email structure';
                    }
                }
            }
        }
    }
    // check providerName 
    name = name.trim();
    if((name == '') && check) {
        btnRegister.disabled = false;
    }else{
        btnRegister.disabled = true;
    }
    return btnRegister.disabled;
}