package org.mapstruct.example.spi;

import org.mapstruct.ap.spi.DefaultAccessorNamingStrategy;

import javax.lang.model.element.ExecutableElement;

public class CustomAccessorNamingStrategy extends DefaultAccessorNamingStrategy {
    @Override
    public String getPropertyName(ExecutableElement getterOrSetterMethod) {
        String methodName = getterOrSetterMethod.getSimpleName().toString();
        // get이나 set으로 시작하면, 기존 로직을 거치고,
        if (methodName.startsWith("get") || methodName.startsWith("set")) {
            return super.getPropertyName(getterOrSetterMethod);
        }
        // 아니라면 methodName 그대로 돌려준다. (is 접두사의 경우, methodName 그대로 반환됨)
        return methodName;
    }
}
