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
    // check providerName 
    name = name.trim();
    if((name == '') && check) {
        btnRegister.disabled = false;
    }else{
        btnRegister.disabled = true;
    }
    return btnRegister.disabled;
}