


// Part of measurement-kit <https://measurement-kit.github.io/>.
// Measurement-kit is free software. See AUTHORS and LICENSE for more
// information on the copying conditions.

// Autogenerated: 2018-04-26-T15:54:12Z

package org.openobservatory.measurement_kit.nettests;

import android.content.Intent;

import org.openobservatory.measurement_kit.android.IntentRouter;
import org.openobservatory.measurement_kit.common.LogCallback;

public class HttpInvalidRequestLineTest implements BaseTest {
    private org.openobservatory.measurement_kit.swig.HttpInvalidRequestLineTest wrapper
        = new org.openobservatory.measurement_kit.swig.HttpInvalidRequestLineTest();

    public HttpInvalidRequestLineTest set_verbosity(long verbosity) {
        wrapper.set_verbosity(verbosity);
        return this;
    }

    public HttpInvalidRequestLineTest increase_verbosity() {
        wrapper.increase_verbosity();
        return this;
    }

    public HttpInvalidRequestLineTest add_input(String input) {
        wrapper.add_input(input);
	return this;
    }

    @Deprecated
    public HttpInvalidRequestLineTest set_input_filepath(String fpath) {
        wrapper.set_input_filepath(fpath);
        return this;
    }

    public HttpInvalidRequestLineTest set_output_filepath(String fpath) {
        wrapper.set_output_filepath(fpath);
        return this;
    }

    public HttpInvalidRequestLineTest set_error_filepath(String fpath) {
        wrapper.set_error_filepath(fpath);
        return this;
    }

    public HttpInvalidRequestLineTest use_logcat() {
        wrapper.use_logcat();
        return this;
    }

    public HttpInvalidRequestLineTest on_log(LogCallback delegate) {
        wrapper.on_log(delegate);
        return this;
    }

    public HttpInvalidRequestLineTest on_log(final String event_id, final IntentRouter router) {
        wrapper.on_log(new LogCallback() {
            @Override
            public void callback(long verbosity, String message) {
                Intent intent = new Intent();
                intent.setAction(event_id);
                intent.putExtra("type", "on_log");
                intent.putExtra("verbosity", verbosity);
                intent.putExtra("message", message);
                router.emit_intent(intent);
            }
        });
        return this;
    }

    public HttpInvalidRequestLineTest on_progress(ProgressCallback delegate) {
        wrapper.on_progress(delegate);
        return this;
    }

    public HttpInvalidRequestLineTest on_progress(final String event_id, final IntentRouter router) {
        wrapper.on_progress(new ProgressCallback() {
            @Override
            public void callback(double percent, String msg) {
                Intent intent = new Intent();
                intent.setAction(event_id);
                intent.putExtra("type", "on_progress");
                intent.putExtra("percent", percent);
                intent.putExtra("message", msg);
                router.emit_intent(intent);
            }
        });
        return this;
    }

    public HttpInvalidRequestLineTest on_event(EventCallback delegate) {
        wrapper.on_event(delegate);
        return this;
    }

    public HttpInvalidRequestLineTest on_event(final String event_id, final IntentRouter router) {
        wrapper.on_event(new EventCallback() {
            @Override
            public void callback(String msg) {
                Intent intent = new Intent();
                intent.setAction(event_id);
                intent.putExtra("type", "on_event");
                intent.putExtra("message", msg);
                router.emit_intent(intent);
            }
        });
        return this;
    }

    public HttpInvalidRequestLineTest on_entry(EntryCallback delegate) {
        wrapper.on_entry(delegate);
        return this;
    }

    public HttpInvalidRequestLineTest on_entry(final String event_id, final IntentRouter router) {
        wrapper.on_entry(new EntryCallback() {
            @Override
            public void callback(String entry) {
                Intent intent = new Intent();
                intent.setAction(event_id);
                intent.putExtra("type", "on_entry");
                intent.putExtra("entry", entry);
                router.emit_intent(intent);
            }
        });
        return this;
    }

    // Deprecated in favour of set_option()
    @Deprecated
    public HttpInvalidRequestLineTest set_options(String key, String value) {
        wrapper.set_option(key, value);
        return this;
    }

    public HttpInvalidRequestLineTest set_option(String key, String value) {
        wrapper.set_option(key, value);
        return this;
    }

    public void run() {
        wrapper.run();
    }

    public void start(TestCompleteCallback cb) {
        wrapper.start(cb);
    }

    public void start(final String event_id, final IntentRouter router) {
        wrapper.start(new TestCompleteCallback() {
            @Override
            public void callback() {
                Intent intent = new Intent();
                intent.setAction(event_id);
                intent.putExtra("type", "on_test_complete");
                router.emit_intent(intent);
            }
        });
    }
}

