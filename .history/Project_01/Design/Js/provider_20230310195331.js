function checkValidLogin() {
    let name = document.getElementById('inputName').value;
    let check = document.getElementById('chkSave').checked;
    // tham chiếu vị tri báo lỗi
    let viewErrName = document.getElementById('errName');
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
        btnRegister.disabled = 
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