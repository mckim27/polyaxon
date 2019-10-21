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

from marshmallow import fields

from polyaxon.schemas.base import BaseConfig, BaseSchema


class RootUserSchema(BaseSchema):
    username = fields.Str(allow_none=True, default="root")
    password = fields.Str(allow_none=True, default="rootpassword")
    email = fields.Email(allow_none=True)

    @staticmethod
    def schema_config():
        return RootUserConfig


class RootUserConfig(BaseConfig):
    SCHEMA = RootUserSchema
    REDUCED_ATTRIBUTES = ["username", "password", "email"]

    def __init__(self, username=None, password=None, email=None):
        self.username = username
        self.password = password
        self.email = email
