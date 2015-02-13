<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link type="text/css" rel="stylesheet" href="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_css/style_new.css" />

<script  src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/datepicker.js"></script>
<script type="text/javascript" src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/library.js"></script>
<script type="text/javascript" src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/tabModule.js"></script>
<script type="text/javascript" src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/jquery.tinycarousel.min.js"></script>
<script type="text/javascript" src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/slideshow.min.js"></script>


 <script type="text/javascript">
    function redirectToOrdersDashboard()
    {
    	window.location.href="${contextPath}/orderslist/vieworders";
    }
    function redirectToCustomersDashboard()
    {
    	window.location.href="${contextPath}/customerlist/customerdeatils";
    }
    
    </script>

  <!--Header Ends here-->
    
     <div id="hdr">
	<div class="hdrc">
	<div class="hdrl">
	<a href="javascript:void(0);" class="mClose"><img src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_images/new/menu-tile.png"/></a>


		<ul class="dnon" id="lmenu">

				<ol>
					<li>
						<a href="#" class="select"  onClick="redirectToCustomersDashboard()" style="border-top:1px solid #494949"   >
							<img src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_images/new/dashboard_icon.png" alt=""/>
							<span>Customers<br>Dashboard</span>
						</a>
					</li>
					<li>
						<a href="#" onClick="redirectToOrdersDashboard()" >
							<img src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_images/new/dashboard_icon.png" alt="" />
							<span>Orders<br>Dashboard</span>
						</a>
					</li>
					<div class="rest_nav" style="opacity:.4;display:block; ">
					<li>
						<a href="#">
							<img src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_images/new/search_icon.png" alt=""/>
							<span class="singleline">Search</span>
						</a>
					</li>
					<li>
						<a href="#">
							<img src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_images/new/notification_icon.png" alt=""/>
							<span class="singleline">Notifications</span>
						</a>
					</li>
					<li>
						<a href="#">
							<img src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_images/new/myteam_icon.png" alt=""/>
							<span class="singleline">My Team</span>
						</a>
					</li>
					<li>
						<a href="#">
							<img src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_images/new/mytargets_icon.png" alt=""/>
							<span>My Targets <br>&amp; Performance</span>
						</a>
					</li>
					</div>
				</ol>
			</ul>
			<span class="title">CSR Dashboard</span>
			</div>
			
			<div class="hdrr">
			
			<a href="javascript:void(0);" class="ntfn">${Queued}</a>
	<a href="javascript:void(0);" id="usrdd" class="usrd">
<%-- 	<img src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_images/new/user.png" alt=""/>
 --%>				<c:if test="${CSR_USER eq null or CSR_USER eq ''}">
					<c:redirect url="/login/csrLogin"/>
				</c:if>${fn:toUpperCase(CSR_USER)}</a>
	
		</div>
		</div>
</div>