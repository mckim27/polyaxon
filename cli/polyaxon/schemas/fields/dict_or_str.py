#!/usr/bin/python
#
# Copyright 2019 Polyaxon, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# -*- coding: utf-8 -*-
from __future__ import absolute_import, division, print_function

from collections import Mapping

from marshmallow import fields


class DictOrStr(fields.Str):
    default_error_messages = {
        "invalid": "Not a valid string or dict.",
        "invalid_utf8": "Not a valid utf-8 string.",
    }

    def _serialize(self, value, attr, obj, **kwargs):
        if isinstance(value, Mapping):
            return value

        return super(DictOrStr, self)._serialize(value=value, attr=attr, obj=obj)

    def _deserialize(self, value, attr, data, **kwargs):
        if isinstance(value, Mapping):
            return value

        return super(DictOrStr, self)._deserialize(value=value, attr=attr, data=data)
