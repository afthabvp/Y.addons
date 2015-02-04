
######################################################################################################
######################################################################################################
#For uninstalling the qrcodeaddon:
####################################################################################################
1. Perform following command to uninstall qrcodeaddon in the project.
	
	ant addoniunnstall -Daddonnames="qrcodeaddon" -DaddonStorefront.yacceleratorstorefront="<<storefront name e.g. bncstorefront>>"

2. Remove the following from localextensions.xml file:
	
	<extension name="qrcodeaddon" />
	<extension name="bncwebservices" />
	<extension name="bncwebserviceshmc" />

3. Remove the following entry from storefront’s spring-cms-config.xml

	<entry key="UCOIDOnOrderConfirmationComponent" value-ref="uCOIDOnOrderConfirmationComponentRenderer"/>
	
	In the following bean entry:
	
	<alias alias="cmsComponentRendererRegistry" name="acceleratorCMSComponentRendererRegistry"/>
	 <bean id="acceleratorCMSComponentRendererRegistry" parent="defaultCMSComponentRendererRegistry">
	  <property name="renderers">
	   <map merge="true">
		<entry key="CMSLinkComponent" value-ref="cmsLinkComponentRenderer"/>
		<entry key="UCOIDOnOrderConfirmationComponent" value-ref="uCOIDOnOrderConfirmationComponentRenderer"/>
	   </map>
	  </property>
	 </bean>
4. Place the dataremovaladdon extension in custom folder of hybris (location:bin/custom)

5. Include the following in localextensions.xml file:
	
	<extension name="dataremovaladdon" />

6. Perform following command to install dataremovaladdon in the storefront.

	ant addoninstall -Daddonnames="dataremovaladdon" -DaddonStorefront.yacceleratorstorefront="<<storefront name e.g. bncstorefront>>"
	
7. Run ant clean all. This will build the entire project once again including your module extensions.
8.	Once the build is successful, start the hybris server using hybrisserver.bat command
9.	Once the hybris server is started, then system update is required.Update  the hybris Commerce Suite.
	The Update page opens with preconfigured settings for update. Perform the following:
	a. Deselect the checkbox stating “Create essential data”
	b. Select the checkbox next to dataremovaladdon
	c. Without changing any more settings, click the Update button. The update process starts and can take several minutes

10. After update is completed. Stop the server and perform the following uninstall command for uninstalling the dataremovaladdon
	
	ant addoniunnstall -Daddonnames="dataremovaladdon" -DaddonStorefront.yacceleratorstorefront="<<storefront name e.g. bncstorefront>>"

11. Remove the following from localextensions.xml file:
	
	<extension name="dataremovaladdon" />
	
12. Remove the following extensions from custom folder : 
	a. qrcodeaddon
	b. bncwebservices
	c. bncwebserviceshmc
	d. dataremovaladdon
	
#############################################################################################################