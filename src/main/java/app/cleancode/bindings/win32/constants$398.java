// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$398 {

    static final FunctionDescriptor WNetCancelConnection2W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WNetCancelConnection2W$MH = RuntimeHelper.downcallHandle(
        "WNetCancelConnection2W",
        constants$398.WNetCancelConnection2W$FUNC
    );
    static final FunctionDescriptor WNetGetConnectionA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetConnectionA$MH = RuntimeHelper.downcallHandle(
        "WNetGetConnectionA",
        constants$398.WNetGetConnectionA$FUNC
    );
    static final FunctionDescriptor WNetGetConnectionW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetConnectionW$MH = RuntimeHelper.downcallHandle(
        "WNetGetConnectionW",
        constants$398.WNetGetConnectionW$FUNC
    );
    static final FunctionDescriptor WNetRestoreSingleConnectionW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WNetRestoreSingleConnectionW$MH = RuntimeHelper.downcallHandle(
        "WNetRestoreSingleConnectionW",
        constants$398.WNetRestoreSingleConnectionW$FUNC
    );
    static final FunctionDescriptor WNetUseConnectionA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetUseConnectionA$MH = RuntimeHelper.downcallHandle(
        "WNetUseConnectionA",
        constants$398.WNetUseConnectionA$FUNC
    );
    static final FunctionDescriptor WNetUseConnectionW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetUseConnectionW$MH = RuntimeHelper.downcallHandle(
        "WNetUseConnectionW",
        constants$398.WNetUseConnectionW$FUNC
    );
}

