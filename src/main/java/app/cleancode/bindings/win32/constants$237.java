// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$237 {

    static final FunctionDescriptor SetProcessWindowStation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProcessWindowStation$MH = RuntimeHelper.downcallHandle(
        "SetProcessWindowStation",
        constants$237.SetProcessWindowStation$FUNC
    );
    static final FunctionDescriptor GetProcessWindowStation$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetProcessWindowStation$MH = RuntimeHelper.downcallHandle(
        "GetProcessWindowStation",
        constants$237.GetProcessWindowStation$FUNC
    );
    static final FunctionDescriptor SetUserObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetUserObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetUserObjectSecurity",
        constants$237.SetUserObjectSecurity$FUNC
    );
    static final FunctionDescriptor GetUserObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "GetUserObjectSecurity",
        constants$237.GetUserObjectSecurity$FUNC
    );
    static final FunctionDescriptor GetUserObjectInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserObjectInformationA$MH = RuntimeHelper.downcallHandle(
        "GetUserObjectInformationA",
        constants$237.GetUserObjectInformationA$FUNC
    );
    static final FunctionDescriptor GetUserObjectInformationW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserObjectInformationW$MH = RuntimeHelper.downcallHandle(
        "GetUserObjectInformationW",
        constants$237.GetUserObjectInformationW$FUNC
    );
}


