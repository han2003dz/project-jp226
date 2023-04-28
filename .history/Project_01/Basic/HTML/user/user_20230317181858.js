function generatePermis() {
  var permis = new Array();
  permis[0] = "---choose---";
  permis[1] = "Members";
  permis[2] = "Authors";
  permis[3] = "Managers";
  permis[4] = "Administrators";
  permis[5] = "Super Admins";
  let opt = "";
  opt += '<select class="form-control" name="inputPermission" disabled>';
  for (var i = 0; i < permis.length; i++) {
    opt += '<option value = "' + i + '">';
    opt += permis[i];
    opt += "</option>";
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
  let opt = "";
  opt += '<select class="form-control" name="inputPermission">';
  permis.forEach((e, index) => {
    opt += '<option value = "' + index + '">';
    opt += element;
    opt += "</option>";
  });
  opt += "</select>";
  document.write(opt);
}
// V3
function outOption(e, i, array) {
  document.write('<option value="' + i + '">' + e + "</option>");
}
function generatePermisV3() {
  var permis = new Array();
  permis[0] = "---choose---";
  permis[1] = "Members";
  permis[2] = "Authors";
  permis[3] = "Managers";
  permis[4] = "Administrators";
  permis[5] = "Super Admins";

  document.write('<select class="form-control" name="inputPermission">');
  permis.forEach(outOption);
  document.write("</select>");
}
//V4
const generatePermisV4 = () => {
  // var permis = new Array();
  var permis = [
    "---choose---",
    "Members",
    "Authors",
    "Managers",
    "Administrators",
    "Super Admins",
  ];
  let opt = '<select class="form-control" name="inputPermission" onchange="refereshPermis()">';
  permis.forEach((element, index) => {
    opt += `<option value="${index}">${element}</option>`;
  });
  opt += "</select>";
  document.write(opt);
};
const generateRoles = () => {
  let roles = new Array();
  roles[0] = "User";
  roles[1] = "Section";
  roles[2] = "Category";
  roles[3] = "Article";
  roles[4] = "Product System";
  roles[5] = "Product Group";
  roles[6] = "Product Category";
  roles[7] = "Product";
  roles[8] = "Order";
  roles[9] = "Customer";
  roles[10] = "Log";

  var role = "";
  roles.forEach((e, index) => {
    if (index % 3 == 0) {
      role += '<div class="row py-1">';
    }
    role += '<div class="col-sm-4">';
    role += `<input type="checkbox" class="form-check-input" id="chk${index}" name="chks" disabled> `;
    role += `<label for="chk${index}">`;
    role += ` ${e} management`;
    role += "</label>";
    role += "</div>";

    if ((index % 3 == 2) || (index == roles.length - 1)) {
      role += "</div>";
    }
  });
  document.write(role);
}


// duyệt các phần tử của form 
function setCheckBox(dis, check){
  var fn = document.getElementById('settings')
  for(var i = 0; i < fn.elements.length; i++){
    if((fn.elements[i].type=='checkbox') && (fn.elements[i].name=='chks')){
      fn.elements[i].disabled = dis;
      fn.elements[i].checked = check;

    }
  }
}
function refereshPermis() {
  var fn = document.getElementById('edit');
  // lấy permission
  /*let permis = parseInt(fn.inputPermission.value);
  if((permis === 4) || (permis === 5)){
    this.setCheckBox(true, true);
  }else if(permis === 3){
    this.setCheckBox(false, true);
  }else if(permis === 2){
    this.setCheckBox(false, false);
  }else{
    this.setCheckBox(false, false);
  }*/
  switch(permis){
    case 4:
    case 5: this.setCheckBoxV2(true, true); break;
    case 3: this.setCheckBox(false, true); break;
    case 2: this.setCheckBox(false, false); break;
    default : this.setCheckBox(false, false);

  }
  document.getElementById('settings').inputPermission.value = permis;
  document.getElementById('settings').inputPermission.disabled = true;
}
const setCheckBoxV2 = (dis, check) => {
  let fn = document.getElementById('settings');
  var checkboxes = fn.querySelectorAll('input[type="checkbox"]');
  for(var i = 0; i < checkboxes.length; i++){
    if((checkboxes[i].name=='chks')){
      checkboxes[i].disabled = dis;
      checkboxes[i].checked = check;
    }
  }
}
