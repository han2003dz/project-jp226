function checkValidLogin() {
    let name = document.getElementById('inputName').value;
    let check = document.getElementById('chkSave').value;
    // tham chiếu vị tri báo lỗi
    let viewErrName = document.getElementById('errName');
    let view
    // biến xác nhận sử hợp lệ
    var validName = true;
    // Biến ghi nhận thông báo
    var message = '';
    // check providerName 
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
    // xuất thông báo của providerName
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
    // 
}