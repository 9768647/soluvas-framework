define(['org.soluvas.image/imageConfigs', 'uritemplate'], function(imageConfigs, UriTemplate) {

var Images = {
	getPublicUri: function(namespace, imageId, styleCode, variantCode, extension) {
		if (typeof namespace === 'undefined') {
			console.error('org.soluvas.web/Image: Namespace must be provided');
			return null;
		}
		if (typeof imageId === 'undefined') {
			console.error('org.soluvas.web/Image: Namespace must be provided');
			return null;
		}
		var styleCode = typeof styleCode !== 'undefined' ? styleCode : 't';
		var styleVariant = typeof variantCode !== 'undefined' ? styleCode + '_' + variantCode : styleCode;
		var extension = typeof extension !== 'undefined' ? extension : 'jpg';
		if (typeof imageConfigs[namespace] === 'undefined') {
			console.error('imageConfigs does not contain namespace', namespace);
			return null;
		}
		
		return imageConfigs[namespace].uriExpander.expand({namespace: namespace, imageId: imageId,
			styleCode: styleCode, variantCode: variantCode, styleVariant: styleVariant, extension: extension});
	},
};

return Images;
});
