// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$495 {

    static final FunctionDescriptor SCardGetCardTypeProviderNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetCardTypeProviderNameA$MH = RuntimeHelper.downcallHandle(
        "SCardGetCardTypeProviderNameA",
        constants$495.SCardGetCardTypeProviderNameA$FUNC
    );
    static final FunctionDescriptor SCardGetCardTypeProviderNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetCardTypeProviderNameW$MH = RuntimeHelper.downcallHandle(
        "SCardGetCardTypeProviderNameW",
        constants$495.SCardGetCardTypeProviderNameW$FUNC
    );
    static final FunctionDescriptor SCardIntroduceReaderGroupA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardIntroduceReaderGroupA$MH = RuntimeHelper.downcallHandle(
        "SCardIntroduceReaderGroupA",
        constants$495.SCardIntroduceReaderGroupA$FUNC
    );
    static final FunctionDescriptor SCardIntroduceReaderGroupW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardIntroduceReaderGroupW$MH = RuntimeHelper.downcallHandle(
        "SCardIntroduceReaderGroupW",
        constants$495.SCardIntroduceReaderGroupW$FUNC
    );
    static final FunctionDescriptor SCardForgetReaderGroupA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardForgetReaderGroupA$MH = RuntimeHelper.downcallHandle(
        "SCardForgetReaderGroupA",
        constants$495.SCardForgetReaderGroupA$FUNC
    );
    static final FunctionDescriptor SCardForgetReaderGroupW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardForgetReaderGroupW$MH = RuntimeHelper.downcallHandle(
        "SCardForgetReaderGroupW",
        constants$495.SCardForgetReaderGroupW$FUNC
    );
}


