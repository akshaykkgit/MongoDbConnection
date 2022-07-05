package com.example.mongodCon.model;

public class ErrorCodeDetails {
        private String _id;
        private String application_name;
        private String module;
        private String errror_code;
        private String error_name;
        private String root_cause;
        private String resolution;


        // Getter Methods

        public String get_id() {
            return _id;
        }

        public String getApplication_name() {
            return application_name;
        }

        public String getModule() {
            return module;
        }

        public String getErrror_code() {
            return errror_code;
        }

        public String getError_name() {
            return error_name;
        }

        public String getRoot_cause() {
            return root_cause;
        }

        public String getResolution() {
            return resolution;
        }

        // Setter Methods

        public void set_id(String _id) {
            this._id = _id;
        }

        public void setApplication_name(String application_name) {
            this.application_name = application_name;
        }

        public void setModule(String module) {
            this.module = module;
        }

        public void setErrror_code(String errror_code) {
            this.errror_code = errror_code;
        }

        public void setError_name(String error_name) {
            this.error_name = error_name;
        }

        public void setRoot_cause(String root_cause) {
            this.root_cause = root_cause;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }
    }