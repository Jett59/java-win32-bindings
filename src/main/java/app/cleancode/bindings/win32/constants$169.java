// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$169 {

    static final FunctionDescriptor SetAclInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetAclInformation$MH = RuntimeHelper.downcallHandle(
        "SetAclInformation",
        constants$169.SetAclInformation$FUNC
    );
    static final FunctionDescriptor SetFileSecurityW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileSecurityW$MH = RuntimeHelper.downcallHandle(
        "SetFileSecurityW",
        constants$169.SetFileSecurityW$FUNC
    );
    static final FunctionDescriptor SetKernelObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetKernelObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetKernelObjectSecurity",
        constants$169.SetKernelObjectSecurity$FUNC
    );
    static final FunctionDescriptor SetPrivateObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPrivateObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetPrivateObjectSecurity",
        constants$169.SetPrivateObjectSecurity$FUNC
    );
    static final FunctionDescriptor SetPrivateObjectSecurityEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPrivateObjectSecurityEx$MH = RuntimeHelper.downcallHandle(
        "SetPrivateObjectSecurityEx",
        constants$169.SetPrivateObjectSecurityEx$FUNC
    );
    static final FunctionDescriptor SetSecurityAccessMask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSecurityAccessMask$MH = RuntimeHelper.downcallHandle(
        "SetSecurityAccessMask",
        constants$169.SetSecurityAccessMask$FUNC
    );
}


