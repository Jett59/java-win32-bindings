// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$687 {

    static final FunctionDescriptor CoGetMalloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetMalloc$MH = RuntimeHelper.downcallHandle(
        "CoGetMalloc",
        constants$687.CoGetMalloc$FUNC
    );
    static final FunctionDescriptor CreateStreamOnHGlobal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateStreamOnHGlobal$MH = RuntimeHelper.downcallHandle(
        "CreateStreamOnHGlobal",
        constants$687.CreateStreamOnHGlobal$FUNC
    );
    static final FunctionDescriptor GetHGlobalFromStream$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetHGlobalFromStream$MH = RuntimeHelper.downcallHandle(
        "GetHGlobalFromStream",
        constants$687.GetHGlobalFromStream$FUNC
    );
    static final FunctionDescriptor CoUninitialize$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle CoUninitialize$MH = RuntimeHelper.downcallHandle(
        "CoUninitialize",
        constants$687.CoUninitialize$FUNC
    );
    static final FunctionDescriptor CoGetCurrentProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoGetCurrentProcess$MH = RuntimeHelper.downcallHandle(
        "CoGetCurrentProcess",
        constants$687.CoGetCurrentProcess$FUNC
    );
    static final FunctionDescriptor CoInitializeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoInitializeEx$MH = RuntimeHelper.downcallHandle(
        "CoInitializeEx",
        constants$687.CoInitializeEx$FUNC
    );
}


