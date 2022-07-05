var dropdown = document.getElementsByClassName("dropdown-btn");
var i;

for (i = 0; i < dropdown.length; i++) {
  dropdown[i].addEventListener("click", function() {
  this.classList.toggle("active");
  var dropdownContent = this.nextElementSibling;
  if (dropdownContent.style.display === "block") {
  dropdownContent.style.display = "none";
  } else {
  dropdownContent.style.display = "block";
  }
  });
}

$(document).ready(function () {

  $.ajax({
    type: 'POST',
    url: 'https://data.mongodb-api.com/app/data-sbkkw/endpoint/data/v1/action/aggregate',
    crossDomain: true,
    headers: { 
      'Content-Type' : 'application/json',
      'Access-Control-Request-Headers' : '*',
      'api-key' : 'qZOSUzY1pbrp0VUhbwflo42fsnnRQKDYCym84IRyz7vTfoc80A4KTkVpzIcnJAN0',
      'Accept' : 'application/json',
      'Access-Control-Allow-Origin' : 'http://localhost:8080',
      'Access-Control-Allow-Methods':'*'
    },
    contentType: 'application/x-www-form-urlencoded; charset=utf-8',
    crossDomain: true,

    data: JSON.stringify(

      {
        "collection": "analyzer_redmine_data",
        "database": "analyzer",
        "dataSource": "analyser",
        "pipeline": [
          {
            "$lookup": {
              "from": "analyzer_errors_collection",
              "localField": "error_code",
              "foreignField": "errror_code",
              "as": "errror_code_details"
            }
          }
        ]
      }


    ),
   
    contentType: "application/json; charset=utf-8",
    dataType   : "json",
    success    : function(respose){
         console.log(respose)
         alert("success");
         //const jsonObject = JSON.parse(respose.documents);
         console.log(respose.documents);

             var tr = '';
            for(var i=0;i<respose.documents.length;i++){
             console.log(i+"............"+respose.documents[i]);
               tr +=  '<tr scope="row"><td><input type="checkbox"></td>'
               tr +=        '<td>' + (i+1) + '</td><td>'
                tr +=       '<td>' + respose.documents[i].errror_code_details[0].application_name + '</td>'
                tr +=       '<td>' + respose.documents[i].errror_code_details[0].module  + '</td>'
                tr +=       '<td>' + respose.documents[i].errror_code_details[0].application_name  + '</td>'
                tr +=      '<td>' + respose.documents[i].errror_code_details[0].errror_code + '</td>'
                tr +=      '<td>' + respose.documents[i].errror_code_details[0].error_name + '</td>'
                 tr +=      '<td>' + respose.documents[i].defect_description + '</td><td>'
                  tr +=    '<td>' + respose.documents[i].errror_code_details[0].root_cause + '</td>'
                  tr +=    '<td>' + respose.documents[i].errror_code_details[0].resolution + '</td>'
                  tr +=    '<td>' + respose.documents[i].status + '</td>'
                  tr +=     '<td>' + respose.documents[i].created_date + '</td>'
                  tr +=     '<td>' + respose.documents[i].created_date + '</td></tr>';


            }
            $('#tbl-related-issues tbody').html(tr);
    },
    error: function(error){
      console.log(error);
      alert("error");
  }  
});
  //$('#table1').DataTable();
});