// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$170 {

    static final FunctionDescriptor SetSecurityDescriptorControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorControl$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorControl",
        constants$170.SetSecurityDescriptorControl$FUNC
    );
    static final FunctionDescriptor SetSecurityDescriptorDacl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorDacl$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorDacl",
        constants$170.SetSecurityDescriptorDacl$FUNC
    );
    static final FunctionDescriptor SetSecurityDescriptorGroup$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorGroup$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorGroup",
        constants$170.SetSecurityDescriptorGroup$FUNC
    );
    static final FunctionDescriptor SetSecurityDescriptorOwner$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorOwner$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorOwner",
        constants$170.SetSecurityDescriptorOwner$FUNC
    );
    static final FunctionDescriptor SetSecurityDescriptorRMControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorRMControl$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorRMControl",
        constants$170.SetSecurityDescriptorRMControl$FUNC
    );
    static final FunctionDescriptor SetSecurityDescriptorSacl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorSacl$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorSacl",
        constants$170.SetSecurityDescriptorSacl$FUNC
    );
}


