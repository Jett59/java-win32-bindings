// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$489 {

    static final FunctionDescriptor DeviceDsmParameterBlock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceDsmParameterBlock$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmParameterBlock",
        constants$489.DeviceDsmParameterBlock$FUNC
    );
    static final FunctionDescriptor DeviceDsmDataSetRanges$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceDsmDataSetRanges$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmDataSetRanges",
        constants$489.DeviceDsmDataSetRanges$FUNC
    );
    static final FunctionDescriptor DeviceDsmNumberOfDataSetRanges$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceDsmNumberOfDataSetRanges$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmNumberOfDataSetRanges",
        constants$489.DeviceDsmNumberOfDataSetRanges$FUNC
    );
    static final FunctionDescriptor DeviceDsmGetInputLength$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmGetInputLength$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmGetInputLength",
        constants$489.DeviceDsmGetInputLength$FUNC
    );
    static final FunctionDescriptor DeviceDsmGetNumberOfDataSetRanges$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmGetNumberOfDataSetRanges$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmGetNumberOfDataSetRanges",
        constants$489.DeviceDsmGetNumberOfDataSetRanges$FUNC
    );
    static final FunctionDescriptor DeviceDsmInitializeInput$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmInitializeInput$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmInitializeInput",
        constants$489.DeviceDsmInitializeInput$FUNC
    );
}

