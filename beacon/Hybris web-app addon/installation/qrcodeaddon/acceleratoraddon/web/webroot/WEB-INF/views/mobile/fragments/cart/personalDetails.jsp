<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="g" uri="http://granule.com/tags/accelerator" %>
<%@ taglib prefix="compressible" tagdir="/WEB-INF/tags/mobile/template/compressible" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/mobile/product" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<json:object>
	<json:property name="Personal_Details" escapeXml="false">
		<script src="${commonResourcePath}/../../addons/qrcodeaddon/mobile/common/bnc_js/jquery.js"></script>
		<script src="${commonResourcePath}/../../addons/qrcodeaddon/mobile/common/bnc_js/amazingcarousel.js"></script>
		<link rel="stylesheet" type="text/css" href="${commonResourcePath}/../../addons/qrcodeaddon/mobile/common/bnc_css/initcarousel-1.css">
		<script src="${commonResourcePath}/../../addons/qrcodeaddon/mobile/common/bnc_js/initcarousel-1.js"></script>
		<script type="text/javascript">
		  document.getElementById("orderDetailsTab").innerHTML = 
			  "<a onclick='javascript:OrderDetailsByOrderID(\"${orderCode}\");'>Order Details</a>"; 
			  document.getElementById("personalDetails").innerHTML = 
				  "<a href='#' class='tabmenuselect'>Personal Details</a>"; 
		  </script>
        <!--------Personal Details Tabel Starts Here-------->
        <div class="personal_details_tabel">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="43%">
              		<c:set var="imageUrl" value="${storeCustomerData.profilePictureURL}"/>
						<c:if test="${empty storeCustomerData.profilePictureURL}">
							<c:set var="imageUrl" value="${commonResourcePath}/../../addons/qrcodeaddon/mobile/common/bnc_images/personal_photos/person1.jpg"/>
						</c:if>
              		<img src="${imageUrl}" alt=""/>
				  </td>
              <td width="57%">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="2" height="10"></td>
            </tr>
            <tr>
              <td class="bluetext">${storeCustomerData.customerName}</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td colspan="2"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                      <td width="43%" class="graytext">UID</td>
                     <!--  <td width="57%" class="graytext">Date Of Birth</td> -->
                    </tr>
                    <tr>
                      <td class="bluetext">${customerModel.uid}</td>
                    <%--   <td class="bluetext">${dob}</td> --%>
                    </tr>
                </table></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td colspan="2"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                      <td width="43%" class="graytext">Address</td>
                      <td width="57%" class="graytext">Postal Code</td> 
                    </tr>
                    <tr>
                     <td class="bluetext"> ${useraddress.line1} <br/>${useraddress.line2} <br/> ${useraddress.town}<br/> ${useraddress.country.name} </td>				   
                     <td class="bluetext">${useraddress.postalcode}</td>
                    </tr>
                </table></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td colspan="2"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                   <tr>
                      <td width="43%" class="graytext">Email</td>
                      <td width="57%" class="graytext">Phone Number</td>
                    </tr>
                    <tr>
                      <td class="bluetext">${useraddress.email}</td>
                      <td class="bluetext">${customerModel.phoneNumbers}</td>
                    </tr>
                </table></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <c:if test="${not empty productData}">
            <tr>
              <td colspan="2" class="grayheading">Recently Viewed</td>
            </tr>
            <tr>
              <td colspan="2">
				<div style="margin:0px auto;">
					<!-- Insert to your webpage where you want to display the carousel -->
					<div id="amazingcarousel-container-1">
					    <div id="amazingcarousel-1" style="display:block;position:relative;width:100%;max-width:720px;margin:0px auto 0px;">
					        <div class="amazingcarousel-list-container">
					            <ul class="amazingcarousel-list">
					            	<c:forEach items="${productData}" var="product">
										<c:url value="${product.url}" var="productQuickViewUrl" />
										<li class="amazingcarousel-item">
						                    <div class="amazingcarousel-item-container">
												<div class="amazingcarousel-image">
													<a href="${productQuickViewUrl}" title="${fn:substring(product.name,0,20)}"  class="html5lightbox" data-group="amazingcarousel-1">
														<div class="thumb">
															<product:productPrimaryImage product="${product}" format="thumbnail"/>
														</div>
													</a>
												</div>
												<div class="amazingcarousel-title">
													${fn:substring(product.name,0,20)}<br>
													<format:fromPrice priceData="${product.price}"/>
												</div>                    
											</div>
						                </li>
									</c:forEach>
					            </ul>
					            <div class="amazingcarousel-prev"></div>
					            <div class="amazingcarousel-next"></div>
					        </div>
					        <div class="amazingcarousel-nav"></div>
					    </div>
					</div>
					<!-- End of body section HTML codes -->
				</div>
               </td>
            </tr>
            </c:if>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <c:if test="${not empty wishlist.entries}">
            <tr>
              <td colspan="2" class="grayheading">Wishlist</td>
            </tr>
             <tr>
              <td colspan="2">
					<div style="margin:0px auto;">
						<div id="amazingcarousel-container-2">
						    <div id="amazingcarousel-2" style="display:block;position:relative;width:100%;max-width:720px;margin:0px auto 0px;">
						        <div class="amazingcarousel-list-container">
						            <ul class="amazingcarousel-list">
						            	<c:forEach items="${wishlist.entries}" var="wishlist">
											<c:url value="${wishlist.product.url}" var="productQuickViewUrl" />
											<li class="amazingcarousel-item">
							                    <div class="amazingcarousel-item-container">
													<div class="amazingcarousel-image">
														<a href="${productQuickViewUrl}" title="${fn:substring(wishlist.product.name,0,20)}"  class="html5lightbox" data-group="amazingcarousel-2">
															<div class="thumb">
																<product:productPrimaryImage product="${wishlist.product}" format="thumbnail"/>
															</div>
														</a>
													</div>
													<div class="amazingcarousel-title">
														${fn:substring(wishlist.product.name,0,20)}<br>
														<format:fromPrice priceData="${wishlist.product.price}"/>
													</div>                    
												</div>
							                </li>
										</c:forEach>
						            </ul>
						            <div class="amazingcarousel-prev"></div>
						            <div class="amazingcarousel-next"></div>
						        </div>
						        <div class="amazingcarousel-nav"></div>
						    </div>
						</div>
					</div>
                </td>
                
            </tr>
             </c:if>
             <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
             <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <c:if test="${not empty recommendedProductsData}">
	            <tr>
	              <td colspan="2" class="grayheading">Recommended Products</td>
	            </tr>
	            <tr>
	              <td colspan="2">
						<div style="margin:0px auto;">
							<div id="amazingcarousel-container-3">
							    <div id="amazingcarousel-3" style="display:block;position:relative;width:100%;max-width:720px;margin:0px auto 0px;">
							        <div class="amazingcarousel-list-container">
							            <ul class="amazingcarousel-list">
							            	<c:forEach items="${recommendedProductsData}" var="product">
												<c:url value="${product.url}" var="productQuickViewUrl" />
												<li class="amazingcarousel-item">
								                    <div class="amazingcarousel-item-container">
														<div class="amazingcarousel-image">
															<a href="${productQuickViewUrl}" title="${fn:substring(product.name,0,20)}"  class="html5lightbox" data-group="amazingcarousel-3">
																<div class="thumb">
																	<product:productPrimaryImage product="${product}" format="thumbnail"/>
																</div>
															</a>
														</div>
														<div class="amazingcarousel-title">
															${fn:substring(product.name,0,20)}<br>
															<format:fromPrice priceData="${product.price}"/>
														</div>                    
													</div>
								                </li>
											</c:forEach>
							            </ul>
							            <div class="amazingcarousel-prev"></div>
							            <div class="amazingcarousel-next"></div>
							        </div>
							        <div class="amazingcarousel-nav"></div>
							    </div>
							</div>
						</div>
	               </td>
	            </tr>
            </c:if>
          </table>
        </div>
        <!--------Personal Details Tabel Starts Here--------> 
  <!--Content Ends here--> 
	</json:property>
	</json:object>