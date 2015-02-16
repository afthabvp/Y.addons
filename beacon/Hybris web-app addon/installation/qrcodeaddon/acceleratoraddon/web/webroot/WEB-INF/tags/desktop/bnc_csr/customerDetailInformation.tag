<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<link type="text/css" rel="stylesheet"
	href="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_css/style_new.css" />
<script
	src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/jquery-1.11.0.min.js"></script>
<script type="text/javascript"
	src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/jquery.slimscroll.min.js"></script>
<script type="text/javascript"
	src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/datepicker.js"></script>
<script type="text/javascript"
	src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/library.js"></script>
<script type="text/javascript"
	src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/tabModule.js"></script>
<script type="text/javascript"
	src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/jquery.tinycarousel.min.js"></script>
<script type="text/javascript"
	src="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_js/new/slideshow.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#accordion").accordion();
	});
</script>

<div class="tab">
	<div class="tab tab-horiz">
		<ul class="tab-legend">
			<li class="active">Order Details</li>
			<li>Customer Details</li>

		</ul>
		<ul class="tab-content">
			<li>
				<!--TAB CONTENT-->
				<div class="slmscr">
					<c:if test="${not empty customerOrderDataList}">


						<div id="accordion">
							<c:forEach items="${customerOrderDataList}" var="order" begin="0"
								end="0">
								<h3 onclick="javascript:loadOrderDetails('${order.orderCode}');">
									<span
										style="font: normal 16px/20px Arial, Helvetica, sans-serif; color: #6f6f6f;">${order.orderCode}&nbsp;&nbsp;&nbsp;&nbsp;Total::${order.total}&nbsp;&nbsp;&nbsp;&nbsp;Placed
										on ${order.placedDate}</span>
								</h3>
								<div id="orderDetails_${order.orderCode}">
									<table width="100%" border="0" cellspacing="0" cellpadding="0"
										class="orderitemtabel">
										<c:forEach items="${orderData.entries}" var="entry">
											<c:url value="${entry.product.url}" var="productUrl" />
											<tr>
												<td><table width="100%" border="0" cellspacing="0"
														cellpadding="0">
														<tr>
															<td width="8%"><product:productPrimaryImage
																	product="${entry.product}" format="thumbnail" /></td>
															<td width="2%"></td>
															<td width="25%">${entry.product.name}</td>
															<td width="12%">${entry.quantity}</td>
															<td width="11%"><format:price
																	priceData="${entry.basePrice}"
																	displayFreeForZero="true" /></td>
															<td width="21%">$${entry.quantity *
																entry.basePrice.value}</td>
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
									<span
										style="font: normal 16px/20px Arial, Helvetica, sans-serif; color: #6f6f6f;">${order.orderCode}&nbsp;&nbsp;&nbsp;&nbsp;Total::${order.total}&nbsp;&nbsp;&nbsp;&nbsp;Placed
										on ${order.placedDate}</span>
								</h3>
								<div id="orderDetails_${order.orderCode}"></div>
							</c:forEach>
						</div>
					</c:if>

				</div>
			</li>
			<li>
				<div class="slmscr1">

					<div class="oh pdg">
						<div class="oh">
							<c:set var="imageUrl"
								value="${storecustomerData.profilePictureURL}" />
							<c:if test="${empty storecustomerData.profilePictureURL}">
								<c:set var="imageUrl"
									value="${commonResourcePath}/../../addons/qrcodeaddon/desktop/common/bnc_images/personal_photos/person1.jpg" />
							</c:if>
							<img src="${imageUrl}" class="fl" /> <span class="tabt">${storecustomerData.customerName}</span>
						</div>

						<div class="oh pdtb20">
							<span class="fl lftt">Date of Birth:</span> <span class="fl rgtt">${informationDto.dob}</span>
						</div>

						<div class="oh pdtb20">
							<span class="fl lftt">Address:</span> <span class="fl rgtt">${informationDto.line1}&nbsp;${informationDto.line2}&nbsp;${informationDto.apartment}&nbsp;${informationDto.postalCode}</span>
						</div>

						<div class="oh pdtb20">
							<span class="fl lftt">UID:</span> <span class="fl rgtt">${storecustomerData.customerId}
							</span>
						</div>


						<div class="oh pdtb20">
							<button id="btn" class="assbt">Assist</button>
						</div>
					</div>
				</div>
			</li>

		</ul>
	</div>

</div>

<div class="wshltc">

	<div id="slideshow" class="disabled">
		<button class="previous">
			<b>« Previous</b>
		</button>
		<button class="next">
			<b>Next »</b>
		</button>

		<div class="strip">
			<div="wishlist">
				<div class="slide sticky">Wish List</div>
				<div id="slider1"><a class="buttons prev" href="#">left</a>
					
					<div class="viewport">
						<ul class="overview">
							<c:if test="${not empty wishlist.entries}">
								<c:forEach items="${wishlist.entries}" var="wishlist">


									<div class="thumb">
										<product:productPrimaryImage product="${wishlist.product}"
											format="thumbnail" />
									</div>${fn:substring(wishlist.product.name,0,20)}<br>
									<format:fromPrice priceData="${wishlist.product.price}" />


								</c:forEach>
							</c:if>

						</ul>
					</div>
					<a class="buttons next" href="#">right</a>
				</div>
			</div>
			<div id="recently">
				<div class="slide">Recently View</div>

				<div class="viewport">
					<ul class="overview">
						<c:forEach items="${productData}" var="product">
							<c:url value="${product.url}" var="productQuickViewUrl" />

							<div class="thumb">
								<product:productPrimaryImage product="${product}"
									format="thumbnail" />
							</div>${fn:substring(product.name,0,20)}<br>
							<format:fromPrice priceData="${product.price}" />

						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
		<div id="recommendations">
			<div class="slide">Recommendations</div>
			<div class="viewport">
				<ul class="overview">
					<c:forEach items="${recommendedProductsData}" var="product">
						<c:url value="${product.url}" var="productQuickViewUrl" />

						<div class="thumb">
							<product:productPrimaryImage product="${product}"
								format="thumbnail" />
						</div> ${fn:substring(product.name,0,20)}<br>
						<format:fromPrice priceData="${product.price}" />
					</c:forEach>
				</ul>

			</div>


		</div>


	</div>
</div>
</div>
