(this.webpackJsonpmu=this.webpackJsonpmu||[]).push([[0],{119:function(e,t){},158:function(e,t,c){},199:function(e,t){},200:function(e,t){},201:function(e,t){},202:function(e,t){},203:function(e,t){},310:function(e,t,c){"use strict";c.r(t);var n,s=c(0),a=c.n(s),r=c(16),i=c.n(r),o=(c(158),c(7)),l=(c(50),c(33)),j=c(14),b=c(77),d=c(336),u=c(337),O=c(32),h=c.n(O),x=c(25),g=c(81),f=c.n(g),m=c(61),p=c(1),v=Object(m.css)(n||(n=Object(b.a)(["\n  display: block;\n  margin: 0 auto;\n  border-color: red;\n"])));var C=function(){var e=Object(s.useContext)(D),t=Object(o.a)(e,2),c=t[0],n=t[1],a=Object(j.f)().ref,r=Object(s.useState)(!1),i=Object(o.a)(r,2),b=i[0],O=i[1],g=Object(s.useState)(""),m=Object(o.a)(g,2),C=m[0],S=m[1],N=Object(s.useState)(""),w=Object(o.a)(N,2),y=w[0],k=w[1],E="/coj/api/v1/webfile/"+a,I=Object(s.useState)(!1),z=Object(o.a)(I,2),R=z[0],T=z[1],F=Object(s.useState)(!1),P=Object(o.a)(F,2),A=P[0],B=P[1],J=Object(s.useState)(!0),q=Object(o.a)(J,2),W=q[0],L=q[1],M=Object(s.useState)(!1),G=Object(o.a)(M,2),U=G[0],V=G[1];Object(s.useEffect)((function(){O(!1),h.a.get(E).then((function(e){L(!1),k(e.data)})).catch((function(e){return L(!1)})),te()}),[C]);var X=function(){T(!1)},H=Object(s.useState)(""),Y=Object(o.a)(H,2),K=Y[0],Q=Y[1],_=Object(s.useState)(!1),Z=Object(o.a)(_,2),$=Z[0],ee=Z[1],te=function(){4===C.length&&(L(!0),h.a.get(E+"/"+C).then((function(e){x.toast.success("Mobile Verification Successful"),n(e.data),L(!1),O(!0)})).catch((function(e){x.toast.error("Mobile Verification Failed"),S(""),L(!1)})))};return Object(p.jsxs)("div",{id:"page",children:[Object(p.jsx)("img",{src:"joh.png",alt:"Joburg-logo"}),Object(p.jsxs)("table",{children:[Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Organization Name"}),Object(p.jsx)("td",{children:"City of Johannesburg"})]}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Bill Reference"}),Object(p.jsx)("td",{children:c.billRef})]})]}),Object(p.jsxs)("fieldset",{children:[Object(p.jsx)("legend",{children:"FUNCTIONS"}),Object(p.jsxs)("div",{className:"functionalities",children:[Object(p.jsx)(l.b,{to:"/coj/pdf/read",children:Object(p.jsx)("button",{children:"VIEW"})}),"  Click to view in your Browser"]}),Object(p.jsxs)("div",{className:"functionalities",children:[Object(p.jsxs)("a",{href:"https://www.e-joburg.org.za/account-manager",children:[" ",Object(p.jsx)("button",{children:"PAY NOW"})]})," Click to pay"]}),Object(p.jsxs)("div",{className:"functionalities",children:[Object(p.jsx)("button",{onClick:function(){h()({url:c.filePath,method:"GET",responseType:"blob"}).then((function(e){var t=window.URL.createObjectURL(new Blob([e.data])),c=document.createElement("a");c.href=t,c.setAttribute("download","bill-invoice.pdf"),document.body.appendChild(c),c.click()}))},children:"DOWNLOAD"})," Download Bill to Device"]}),Object(p.jsxs)("div",{className:"functionalities",children:[Object(p.jsx)("button",{onClick:function(e){e.preventDefault(),T(!0)},children:"EMAIL"})," Email PDF to your Email Address"]}),Object(p.jsxs)("div",{className:"functionalities",children:[Object(p.jsxs)("a",{href:"https://www.joburg.org.za/key-documents",children:[" ",Object(p.jsx)("button",{children:"KEY DOCUMENTS"})]})," Click to view Key Documents"]})]}),Object(p.jsx)("br",{}),Object(p.jsxs)("fieldset",{className:"query",children:[Object(p.jsx)("legend",{children:"GENERAL QUERIES"}),Object(p.jsx)("p",{children:Object(p.jsx)("b",{children:"Customer Care Number"})}),Object(p.jsx)("p",{children:"0860 Joburg or 0860 56 28 74"}),Object(p.jsx)("a",{href:"malto:joburgconnect@joburg.org.za",children:Object(p.jsx)("p",{children:Object(p.jsx)("b",{children:"joburgconnect@joburg.org.za"})})}),Object(p.jsxs)("table",{children:[Object(p.jsx)("td",{children:Object(p.jsx)("b",{children:"Customer Service Centre"})}),Object(p.jsx)("td",{children:Object(p.jsx)("b",{children:"Email Address"})}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Waterfall CSC"}),Object(p.jsx)("td",{children:Object(p.jsx)("a",{href:"malto:regionArevenue@joburg.org.za",children:"regionArevenue@joburg.org.za"})})]}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Randburg Civic Centre"}),Object(p.jsx)("td",{children:Object(p.jsx)("a",{href:"malto:regionBrevenue@joburg.org.za",children:"regionBrevenue@joburg.org.za"})})]}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Roodepoort Civic Centre & City Hall"}),Object(p.jsx)("td",{children:Object(p.jsx)("a",{href:"malto:regionCrevenue@joburg.org.za",children:"regionCrevenue@joburg.org.za"})})]}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Jabulani Civic Centre"}),Object(p.jsx)("td",{children:Object(p.jsx)("a",{href:"malto:regionDrevenue@joburg.org.za",children:"regionDrevenue@joburg.org.za"})})]}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Sandton Regional Office"}),Object(p.jsx)("td",{children:Object(p.jsx)("a",{href:"malto:regionErevenue@joburg.org.za",children:"regionErevenue@joburg.org.za"})})]}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Thuso House CSC"}),Object(p.jsx)("td",{children:Object(p.jsx)("a",{href:"malto:regionFrevenue@joburg.org.za",children:"regionFrevenue@joburg.org.za"})})]}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Lenasia Civic CSC"}),Object(p.jsx)("td",{children:Object(p.jsx)("a",{href:"malto:regionGrevenue@joburg.org.za",children:"regionGrevenue@joburg.org.za"})})]})]})]}),Object(p.jsx)(d.a,{scroll:"body",maxWidth:"lg",open:R,onClose:X,children:Object(p.jsxs)("div",{className:"modal",children:[U&&Object(p.jsx)(u.a,{severity:"error",children:"Input Field Empty or Internet Connection lost"}),A&&Object(p.jsx)(u.a,{severity:"success",children:"Email sent!"}),Object(p.jsxs)("center",{children:[Object(p.jsx)("h3",{children:"Email Address"}),Object(p.jsx)("input",{className:"mobile-input",type:"email",required:!0,placeholder:"email address...",value:K,onChange:function(e){return Q(e.target.value)}}),Object(p.jsx)("br",{}),Object(p.jsxs)("div",{className:"buttons",children:[Object(p.jsx)("button",{className:"close",onClick:X,children:"close"}),Object(p.jsx)("button",{className:"bill",onClick:function(){""===K?V(!0):h.a.get(E+"/sendemail/"+K).then((function(e){B(!0),setTimeout((function(){B(!1),T(!1)}),2e3)})).catch((function(e){V(!0),setTimeout((function(){V(!1),T(!1)}),2e3)}))},children:"Send Bill"})]})]})]})}),Object(p.jsx)(d.a,{scroll:"body",maxWidth:"lg",open:$,onClose:function(){ee(!1)},children:Object(p.jsx)("div",{className:"modal",children:Object(p.jsx)("p",{children:null===c.filePath?"This Bill is not authentic and not from City of Joburg":"This Bill is authentic from City of Joburg"})})}),Object(p.jsx)(d.a,{scroll:"body",maxWidth:"lg",open:!b,children:Object(p.jsx)("div",{className:"modal",children:W?Object(p.jsx)(f.a,{loading:!0,size:90,css:v,color:"#4a20e4",speedMultiplier:4}):Object(p.jsxs)(p.Fragment,{children:[Object(p.jsx)("p",{children:""===y?"Invalid Bill Reference":"Enter the last 4 digits of your mobile"}),""===y?"":Object(p.jsxs)(p.Fragment,{children:[Object(p.jsxs)("p",{children:[" ",y+"XXXX"]}),Object(p.jsxs)("center",{children:[!W&&Object(p.jsx)("input",{className:"mobile-input",maxLength:"4",type:"text",value:C,onChange:function(e){return S(e.target.value)}}),W&&Object(p.jsx)("p",{children:"checking..."})]})]})]})})})]})},S=c(105),N=c(104);function w(){var e=Object(s.useState)(null),t=Object(o.a)(e,2),c=t[0],n=t[1],a=Object(s.useState)(1),r=Object(o.a)(a,2),i=r[0],l=(r[1],Object(s.useContext)(D)),j=Object(o.a)(l,1)[0];function b(e){var t=e.numPages;n(t)}return Object(p.jsx)("div",{children:Array.apply(null,new Array(c)).map((function(e,t){return Object(p.jsxs)(S.a,{file:{url:j.filePath},onLoadSuccess:b,children:[Object(p.jsx)(S.b,{pageNumber:i+t}),"_"]})}))})}N.a.GlobalWorkerOptions.workerSrc="//cdnjs.cloudflare.com/ajax/libs/pdf.js/".concat(N.a.version,"/pdf.worker.min.js");var y,k=c(147),E=function(e){var t=e.data1,c=e.data2,n=e.label1,a=e.label2,r=e.desc,i=Object(s.useState)({labels:[n,a],datasets:[{data:[t,c],backgroundColor:["#949FB1","#FDB45C","#4D5360"],hoverBackgroundColor:["#FF5A5E","#5AD3D1"]}]}),l=Object(o.a)(i,2),j=l[0];l[1];return Object(p.jsxs)(p.Fragment,{children:[Object(p.jsx)("h3",{className:"mt-5",children:r}),Object(p.jsx)(k.a,{data:j,options:{responsive:!0},className:"chart"})]})},I=Object(m.css)(y||(y=Object(b.a)(["\n  display: block;\n  margin: 0 auto;\n  border-color: red;\n"]))),z=function(){var e=Object(s.useContext)(B),t=Object(o.a)(e,2),c=t[0],n=t[1];Object(s.useEffect)((function(){null===c&&null===sessionStorage.getItem("dat1")?(J(!0),R(!0)):(J(!1),R(!1)),null!==sessionStorage.getItem("user")&&u(sessionStorage.getItem("user"))}),[c]);var a=Object(s.useContext)(A),r=Object(o.a)(a,2),i=(r[0],r[1]),l=Object(s.useContext)(D),j=Object(o.a)(l,2),b=j[0],u=j[1],O=Object(s.useState)([]),g=Object(o.a)(O,2),m=g[0],v=g[1],C=Object(s.useState)(""),S=Object(o.a)(C,2),N=S[0],w=S[1],y=Object(s.useState)(!1),k=Object(o.a)(y,2),z=k[0],R=k[1],T=Object(s.useState)(!1),F=Object(o.a)(T,2),P=F[0],J=F[1],q=Object(s.useState)(""),W=Object(o.a)(q,2),L=W[0],M=W[1],G=Object(s.useState)(""),U=Object(o.a)(G,2),V=U[0],X=U[1];return Object(p.jsxs)("div",{className:"dashboard",children:["From",Object(p.jsx)("input",{classname:"date-input",type:"date",value:L,onChange:function(e){return M(e.target.value)}}),"To ",Object(p.jsx)("input",{classname:"date-input",type:"date",value:V,onChange:function(e){return X(e.target.value)}}),Object(p.jsx)("span",{className:"btn-search",onClick:function(){n(null),J(!0),R(!0),h.a.get("/coj/api/v1/user/getdata",{headers:{Authorization:"Bearer ".concat(sessionStorage.getItem("uux"))},params:{from:new Date(L.substring(0,4),L.substring(5,7)-1,L.substring(8,10)).getTime(),to:new Date(V.substring(0,4),V.substring(5,7)-1,V.substring(8,10)).getTime()}}).then((function(e){J(!1),R(!1),n(e.data)})).catch((function(e){R(!1),J(!1),x.toast.error("Error fetching data!")}))},children:"filter "}),Object(p.jsx)("span",{className:"btn-reset",onClick:function(){J(!0),R(!0),n(null),setTimeout((function(){n(JSON.parse(sessionStorage.getItem("dat1"))),J(!1),R(!1)}),400)},children:"clear "}),Object(p.jsx)("span",{className:"btn-reset",onClick:function(){return R(!0)},children:"Create Certificate "}),Object(p.jsxs)("div",{className:"username",children:[null!==c&&Object(p.jsx)("span",{children:b}),Object(p.jsx)("img",{src:"https://img.icons8.com/external-kmg-design-glyph-kmg-design/200/000000/external-power-user-interface-kmg-design-glyph-kmg-design.png",className:"img-logout",alt:"logout",onClick:function(){sessionStorage.clear(),i(!1),x.toast.info("Logged Out!")}})]}),Object(p.jsxs)("fieldset",{children:[Object(p.jsx)("legend",{children:"Data Summary"}),Object(p.jsxs)("table",{children:[Object(p.jsx)("th",{children:"Web Files"}),Object(p.jsx)("th",{children:"Pending Email Request"}),Object(p.jsx)("th",{children:"Pending SMS Request"}),Object(p.jsx)("th",{children:"Verified Files"}),Object(p.jsxs)("tr",{className:"admin-tablerow",children:[Object(p.jsx)("td",{children:null!==c?c.webfilecount:""}),Object(p.jsx)("td",{children:null!==c?c.pendingemailrequestcount:""}),Object(p.jsx)("td",{children:null!==c?c.pendingsmsrequestcount:""}),Object(p.jsx)("td",{children:null!==c?c.verifiedfiles:""})]})]})]}),null!==c&&Object(p.jsxs)("div",{className:"chart",children:[Object(p.jsx)(E,{data1:c.total-c.webfilecount,data2:c.webfilecount,label1:"Total",label2:"Webfile",desc:"Webile"}),Object(p.jsx)(E,{data1:c.total-c.pendingemailrequestcount,data2:c.pendingemailrequestcount,label1:"Sent",label2:"Pending",desc:"Pending Email Requests"}),Object(p.jsx)(E,{data1:c.total-c.pendingsmsrequestcount,data2:c.pendingsmsrequestcount,label1:"Sent",label2:"Pending ",desc:"Pending SMS Requests"}),Object(p.jsx)(E,{data1:c.total-c.verifiedfiles,data2:c.verifiedfiles,label1:"Total",label2:"unverified Files",desc:"Verified Files"})]}),Object(p.jsx)("br",{}),Object(p.jsx)(d.a,{scroll:"body",maxWidth:"lg",open:z,onClose:function(){R(!1)},children:Object(p.jsx)("div",{className:"modal",children:P?Object(p.jsx)(f.a,{loading:!0,size:90,css:I,color:"#FDB45C",speedMultiplier:4}):Object(p.jsxs)("center",{children:[Object(p.jsx)("h1",{children:"Invoice Certificate"}),Object(p.jsx)("input",{className:"mobile-input",type:"email",required:!0,placeholder:"reference or mobile",value:N,onChange:function(e){return w(e.target.value)}}),Object(p.jsx)("br",{}),Object(p.jsx)("button",{className:"btn-search",onClick:function(){J(!0),h.a.get("/coj/api/v1/webfile/search/ref/mobile/".concat(N),{headers:{Authorization:"Bearer ".concat(sessionStorage.getItem("uux"))}}).then((function(e){J(!1),v(e.data)})).catch((function(e){J(!1),x.toast.error("Error fetching data")}))},children:"search"}),Object(p.jsx)("br",{}),0!==m.length&&Object(p.jsxs)("table",{className:"table-admin",children:[Object(p.jsx)("th",{children:"S/N"}),Object(p.jsx)("th",{children:"Reference"}),Object(p.jsx)("th",{children:"Bill Reference"}),Object(p.jsx)("th",{children:"Mobile"}),Object(p.jsx)("th",{children:"Date"}),Object(p.jsx)("th",{children:"Action"}),void 0!==m[0]&&m.map((function(e,t){return Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:t+1}),Object(p.jsx)("td",{children:e.reference}),Object(p.jsx)("td",{children:e.billRef}),Object(p.jsx)("td",{children:e.mobile}),Object(p.jsx)("td",{children:new Date(e.created).toLocaleDateString()}),Object(p.jsx)("td",{children:Object(p.jsx)("button",{className:"btn-admin",onClick:function(){return function(e){var t={transRef:e.reference,mobile:e.mobile,email:e.email};J(!0),h.a.post("/coj/api/v1/invoicecert",t,{headers:{Authorization:"Bearer ".concat(sessionStorage.getItem("uux"))}}).then((function(e){J(!1),x.toast.success("Certificate created!")})).catch((function(e){J(!1),x.toast.error("certificate creation failed!")}))}(e)},children:"Create Invoice"})})]})}))]})]})})})]})},R=c(18),T=function(){var e=Object(s.useContext)(A),t=Object(o.a)(e,2),c=(t[0],t[1]),n=Object(s.useContext)(B),a=Object(o.a)(n,2),r=(a[0],a[1]),i=Object(s.useContext)(D),l=Object(o.a)(i,2),j=(l[0],l[1]),b=Object(s.useState)({username:"",password:""}),d=Object(o.a)(b,2),u=d[0],O=d[1];return Object(p.jsx)("div",{className:"login",children:Object(p.jsxs)("fieldset",{id:"login-fieldset",children:[Object(p.jsx)("legend",{children:"Admin Login"}),Object(p.jsx)("input",{id:"login-input",type:"text",placeholder:"username",value:u.username,onChange:function(e){return O(Object(R.a)(Object(R.a)({},u),{},{username:e.target.value}))}}),Object(p.jsx)("br",{}),Object(p.jsx)("input",{id:"login-input",type:"password",placeholder:"password",value:u.password,onChange:function(e){return O(Object(R.a)(Object(R.a)({},u),{},{password:e.target.value}))}}),Object(p.jsx)("br",{}),Object(p.jsx)("br",{}),Object(p.jsx)("span",{className:"login-button",onClick:function(){h.a.post("/coj/api/v1/user/login",u).then((function(e){c(!0),sessionStorage.setItem("uux",e.data.jwt),j(e.data.user),sessionStorage.setItem("user",e.data.user),h.a.get("/coj/api/v1/user/getdata",{headers:{Authorization:"Bearer ".concat(sessionStorage.getItem("uux"))}}).then((function(e){r(e.data),sessionStorage.setItem("dat1",JSON.stringify(e.data))})).catch((function(e){x.toast.error("Error loading data"),r({webfilecount:0,verifiedfiles:0,pendingsmsrequestcount:0,pendingemailrequestcount:0,total:0})}))})).catch((function(e){return x.toast.error("Invalid credentials")}))},children:"Login"})]})})},F=function(e){var t=e.match,c=Object(s.useContext)(A),n=Object(o.a)(c,2),a=n[0],r=n[1];Object(s.useEffect)((function(){null!==sessionStorage.getItem("uux")&&r(!0),null!==sessionStorage.getItem("dat1")&&d(JSON.parse(sessionStorage.getItem("dat1")))}),[a]);var i=Object(s.useContext)(B),b=Object(o.a)(i,2),d=(b[0],b[1]);return Object(p.jsxs)(p.Fragment,{children:[Object(p.jsx)("img",{src:"../joh.png",alt:"Joburg-logo"}),Object(p.jsx)(l.a,{children:Object(p.jsx)(j.c,{children:Object(p.jsx)(j.a,{to:"".concat(t.url,"/console"),exact:!0,component:a?z:T})})})]})};var P=function(){var e=Object(s.useContext)(D),t=Object(o.a)(e,2),c=t[0],n=t[1];return Object(p.jsxs)("div",{id:"page",children:[Object(p.jsx)("img",{src:"../joh.png",alt:"Joburg-logo"}),Object(p.jsxs)("fieldset",{className:"query",children:[Object(p.jsx)("p",{children:Object(p.jsx)("b",{children:"NEW TARIFF"})}),Object(p.jsx)("p",{children:"See our new tariff by clicking on the links below"}),Object(p.jsxs)("table",{children:[Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Water and Sanitation"}),Object(p.jsx)("td",{children:Object(p.jsx)(l.b,{to:"/coj/pdf/read",onClick:function(){n(Object(R.a)(Object(R.a)({},c),{},{filePath:"https://blacksiliconimages.s3.us-west-2.amazonaws.com/COJ/tariff/Joburg+water.pdf"}))},children:"Water and Sanitation Tariff"})})]}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Electricity"}),Object(p.jsx)("td",{children:Object(p.jsx)(l.b,{to:"/coj/pdf/read",onClick:function(){n(Object(R.a)(Object(R.a)({},c),{},{filePath:"https://blacksiliconimages.s3.us-west-2.amazonaws.com/COJ/tariff/Electricity+Tariff.pdf"}))},children:"Electricity Tariff"})})]}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Refuse"}),Object(p.jsx)("td",{children:Object(p.jsx)(l.b,{to:"/coj/pdf/read",onClick:function(){n(Object(R.a)(Object(R.a)({},c),{},{filePath:"https://blacksiliconimages.s3.us-west-2.amazonaws.com/COJ/tariff/Refuse+Tariff.pdf"}))},children:"Refuse Tariff"})})]}),Object(p.jsxs)("tr",{children:[Object(p.jsx)("td",{children:"Property Rates"}),Object(p.jsx)("td",{children:Object(p.jsx)(l.b,{to:"/coj/pdf/read",onClick:function(){n(Object(R.a)(Object(R.a)({},c),{},{filePath:"https://blacksiliconimages.s3.us-west-2.amazonaws.com/COJ/tariff/UNDERSTANDING+PROPERTY+RATES.pdf"}))},children:"Property Rates Tariff"})})]})]})]})]})},D=(c(309),a.a.createContext()),A=a.a.createContext(),B=a.a.createContext();var J=function(){var e=Object(s.useState)({}),t=Object(o.a)(e,2),c=t[0],n=t[1],a=Object(s.useState)(!1),r=Object(o.a)(a,2),i=r[0],b=r[1],d=Object(s.useState)(null),u=Object(o.a)(d,2),O=u[0],h=u[1];return Object(s.useEffect)((function(){null!==sessionStorage.getItem("uux")&&(b(!0),h(JSON.parse(sessionStorage.getItem("data1"))))}),[]),Object(p.jsx)(D.Provider,{value:[c,n],children:Object(p.jsx)(A.Provider,{value:[i,b],children:Object(p.jsxs)(B.Provider,{value:[O,h],children:[Object(p.jsx)(x.ToastContainer,{autoClose:1300,hideProgressBar:!0,pauseOnHover:!1,closeButton:!1}),Object(p.jsx)(l.a,{children:Object(p.jsxs)(j.c,{children:[Object(p.jsx)(j.a,{exact:!0,path:"/coj/:ref",component:C}),Object(p.jsx)(j.a,{path:"/coj/pdf/read",component:w}),Object(p.jsx)(j.a,{path:"/coj/admin/",component:F}),Object(p.jsx)(j.a,{path:"/coj/tariff/new",component:P})]})})]})})})},q=function(e){e&&e instanceof Function&&c.e(3).then(c.bind(null,339)).then((function(t){var c=t.getCLS,n=t.getFID,s=t.getFCP,a=t.getLCP,r=t.getTTFB;c(e),n(e),s(e),a(e),r(e)}))};i.a.render(Object(p.jsx)(a.a.StrictMode,{children:Object(p.jsx)(J,{})}),document.getElementById("root")),q()},50:function(e,t,c){}},[[310,1,2]]]);
//# sourceMappingURL=main.5386bb46.chunk.js.map