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
                        message = 'Username '
                    }
                }
            }
        }
    }
}