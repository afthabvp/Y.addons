<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css">
<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

<script src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/jquery.js"></script>
<script src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/amazingcarousel.js"></script>
<link rel="stylesheet" type="text/css" href="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_css/initcarousel-1.css">
<script src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/initcarousel-1.js"></script>

<script type="text/javascript">
$(document).ready(function() {
	$("#accordion").accordion();
});
</script>
<div class="content_tabel">
	<!--------Personal Details Tabel Starts Here-------->
	<div class="personal_details_tabel">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="43%">
					<c:set var="imageUrl" value="${storecustomerData.profilePictureURL}"/>
					<c:if test="${empty storecustomerData.profilePictureURL}">
						<c:set var="imageUrl" value="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_images/personal_photos/person1.jpg"/>
					</c:if>
             	<img src="${imageUrl}" alt=""/>
				</td>
				<td width="57%">&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td width="43%" class="bluetext">${storecustomerData.customerName}</td>
				<td width="57%">&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2"><table width="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td width="43%" class="graytext">Date of Birth</td>
							<td width="57%" class="graytext">Address</td>
						</tr>
						<tr>
							<td class="bluetext">${informationDto.dob}</td>
							<td class="bluetext">${informationDto.line1}&nbsp;${informationDto.line2}&nbsp;${informationDto.apartment}&nbsp;${informationDto.postalCode}</td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2"><table width="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td width="43%" class="graytext">UID</td>
							<td width="57%">&nbsp;</td>
						</tr>
						<tr>
							<td class="bluetext">${storecustomerData.customerId}</td>
							<td width="57%">&nbsp;</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td width="43%" class="graytext">Email ID</td>
							<td width="57%">&nbsp;</td>
						</tr>
						<tr>
							<td class="bluetext">${storecustomerData.customerId}</td>
							<td width="57%">&nbsp;</td>
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
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<c:if test="${not empty customerOrderDataList}">
				<tr>
					<td colspan="2" class="grayheading">Order History</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td colspan="2">
						<div id="accordion">
							<c:forEach items="${customerOrderDataList}" var="order" begin="0" end="0">
								<h3 onclick="javascript:loadOrderDetails('${order.orderCode}');">
									<span style="font:normal 16px/20px Arial, Helvetica, sans-serif; color:#6f6f6f;">${order.orderCode}&nbsp;&nbsp;&nbsp;&nbsp;Total::${order.total}&nbsp;&nbsp;&nbsp;&nbsp;Placed on ${order.placedDate}</span>
								</h3>
								<div id="orderDetails_${order.orderCode}">
									<table width="100%" border="0" cellspacing="0" cellpadding="0" class="orderitemtabel">
				              	<c:forEach items="${orderData.entries}" var="entry">
											<c:url value="${entry.product.url}" var="productUrl" />
											<tr>
						                      <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
						                          <tr>
						                            <td width="8%"><product:productPrimaryImage	product="${entry.product}" format="thumbnail" /></td>
						                            <td width="2%"></td>
						                            <td width="25%">${entry.product.name}</td>
						                            <td width="12%">${entry.quantity}</td>
						                            <td width="11%"><format:price priceData="${entry.basePrice}"	displayFreeForZero="true" /></td>
						                            <td width="21%">$${entry.quantity * entry.basePrice.value}</td>
						                            <td width="3%">&nbsp;</td>
						                          </tr>
						                        </table></td>
						                    </tr>
						                    <tr>
						                      <td height="10"></td>
						                    </tr>
										</c:forEach>
				                </table>
								</div>
							</c:forEach>
							<c:forEach items="${customerOrderDataList}" var="order" begin="1">
								<h3 onclick="javascript:loadOrderDetails('${order.orderCode}');">
									<span style="font:normal 16px/20px Arial, Helvetica, sans-serif; color:#6f6f6f;">${order.orderCode}&nbsp;&nbsp;&nbsp;&nbsp;Total::${order.total}&nbsp;&nbsp;&nbsp;&nbsp;Placed on ${order.placedDate}</span>
								</h3>
								<div id="orderDetails_${order.orderCode}">
								</div>
							</c:forEach>
						</div>
					</td>
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
			</c:if>
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
</div>
