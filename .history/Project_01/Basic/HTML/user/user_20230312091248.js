function generatePermis() {
  var permis = new Array();
  permis[0] = "---choose---";
  permis[1] = "Members";
  permis[2] = "Authors";
  permis[3] = "Managers";
  permis[4] = "Administrators";
  permis[5] = "Super Admins";
  let opt = '';
  opt += '<select class="form-control" id="inputPermission">';
  for(var i = 0; i < permis.length; i++){
    opt += '<option value = "'+i+'">';
    opt += permis[i];
    opt += '</option>';
  }
  
//   opt += '<option value="0">========SELECT========</option>';
//   opt += '<option value="1">Members</option>';
//   opt += '<option value="2">Authors</option>';
//   opt += '<option value="3">Managers</option>';
//   opt += '<option value="4">Administrators</option>';
//   opt += '<option value="5">Super Admin</option>';
  opt += "</select>";
  // xuất cấu trúc ra màn hình
  document.write(opt);
}
function generatePermisV2() {
  var permis = new Array();
  permis[0] = "---choose---";
  permis[1] = "Members";
  permis[2] = "Authors";
  permis[3] = "Managers";
  permis[4] = "Administrators";
  permis[5] = "Super Admins";
  let opt = '';
  opt += '<select class="form-control" id="inputPermission">';
  permis.forEach((e, index) => {
    opt += '<option value = "'+index+'">';
    opt += element;
    opt += '</option>';
  });
  opt += "</select>";
  document.write(opt);
}
// V3
function outOption(e, i, array){
  document.write('<option value="'+i+'">'+e+'</option>');
}
function generatePermisV3() {
  var permis = new Array();
  permis[0] = "---choose---";
  permis[1] = "Members";
  permis[2] = "Authors";
  permis[3] = "Managers";
  permis[4] = "Administrators";
  permis[5] = "Super Admins";
  
  document.write('<select class="form-control" id="inputPermission">');
  permis.forEach(outOption);
  document.write("</select>");
}
// V4
const generatePermisV4 = () => {
  var permis = new Array();
  permis[0] = "---choose---";
  permis[1] = "Members";
  permis[2] = "Authors";
  permis[3] = "Managers";
  permis[4] = "Administrators";
  permis[5] = "Super Admins";
}