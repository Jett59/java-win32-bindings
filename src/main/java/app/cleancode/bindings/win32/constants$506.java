// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$506 {

    static final FunctionDescriptor WNetAddConnection4W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WNetAddConnection4W$MH = RuntimeHelper.downcallHandle(
        "WNetAddConnection4W",
        constants$506.WNetAddConnection4W$FUNC
    );
    static final FunctionDescriptor WNetCancelConnectionA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WNetCancelConnectionA$MH = RuntimeHelper.downcallHandle(
        "WNetCancelConnectionA",
        constants$506.WNetCancelConnectionA$FUNC
    );
    static final FunctionDescriptor WNetCancelConnectionW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WNetCancelConnectionW$MH = RuntimeHelper.downcallHandle(
        "WNetCancelConnectionW",
        constants$506.WNetCancelConnectionW$FUNC
    );
    static final FunctionDescriptor WNetCancelConnection2A$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WNetCancelConnection2A$MH = RuntimeHelper.downcallHandle(
        "WNetCancelConnection2A",
        constants$506.WNetCancelConnection2A$FUNC
    );
    static final FunctionDescriptor WNetCancelConnection2W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WNetCancelConnection2W$MH = RuntimeHelper.downcallHandle(
        "WNetCancelConnection2W",
        constants$506.WNetCancelConnection2W$FUNC
    );
    static final FunctionDescriptor WNetGetConnectionA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetConnectionA$MH = RuntimeHelper.downcallHandle(
        "WNetGetConnectionA",
        constants$506.WNetGetConnectionA$FUNC
    );
}


